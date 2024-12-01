package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bloggers")
public class BloggerController {
	public BloggerController() {
		System.out.println("in ctor of"+getClass());
	}
	//add request handling method to render blogger's home page
	//http://localhost:8080/day15.2/blogger/home , method=GET
	@GetMapping("/home")
	public String showBloggerHomePage() {
		System.out.println("in show blogger hm page");
		return "/bloggers/home";//LVN --> D.S --> V.R --> AVN : /WEB-INF/views/blogger/home.jsp
	}
	

}
