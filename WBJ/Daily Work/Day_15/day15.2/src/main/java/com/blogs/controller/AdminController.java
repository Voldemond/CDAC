package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	public AdminController() {
		System.out.println("in ctor of"+getClass());
	}
	//add request handling method to render admin's home page
	//http://localhost:8080/day15.2/admin/home , method=GET
	@GetMapping("/home")
	public String showAdminHomePage() {
		System.out.println("in show admin hm page");
		return "/admin/home";//LVN --> D.S --> V.R --> AVN : /WEB-INF/views/admin/home.jsp
	}
	

}
