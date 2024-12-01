package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.pojos.User;
import com.blogs.pojos.UserRole;
import com.blogs.service.UserService;

@Controller // spring bean containing req handling logic
@RequestMapping("/users")
public class UserController {
	// depcy - service layer i/f
	@Autowired // byType
	private UserService userService;

	// Add req handling method -for processing login form
	// URL - http://host:port/ctx_path/users/signin , method=POST
	@PostMapping("/signin")
	// @RequestParam : it's method arg level annotation
	// , to bind req params -> method arg . Match req param name with method arg
	// name
	// eg String email=request.getParam("email")
	public String processLoginForm(@RequestParam String email, @RequestParam String password, HttpSession session) {
		System.out.println("in process login form " + email + " " + password);
		try {
			// invoke service layer method for user authentication
			// in case of successful auth -> save user details under session scope
			User user = userService.signIn(email, password);
			// => valid login -> chk role -> blogger -> redirect blogger to the home page
			session.setAttribute("user_details", user);
			session.setAttribute("mesg","Login Successful");
			if (user.getRole() == UserRole.ADMIN)
				return "redirect:/admin/home";// redirect to admin home
			// => blogger -> redirect to blogger home
			return "redirect:/bloggers/home";
			// Java code -
			// response.sendRedirect(response.encodeRedirectURL("/blogger/home"));
			/*
			 * WC sends temp redirect resp (SC 302 , Location - /blogger/home , body :
			 * empty) Web browser new request - http://host:port/ctx/blogger/home,
			 * method=GET
			 */
		} catch (RuntimeException e) {
			System.out.println("err in handler " + e);
			// => invalid login , redirect client to login page , with error mesg
			session.setAttribute("mesg", "Invalid Email or Password");
			return "redirect:/";
			// Web browser new request - http://host:port/ctx/
		}

		/*
		 * Instead of returning LVN(forward view name) , return redirect view name(RVN)
		 */
	}

}
