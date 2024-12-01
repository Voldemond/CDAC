package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // mandatory , it represents a spring bean containing 
//HTTP request handling logic
//singleton n eager
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor "+getClass());
	}
	//Add request handling methof to render the index page
	// URL - http://host:port/ctx_path/
	//In HandlerMapping bean - 
	//Key : / 
	//value : HomePageController.renderLoginPage
	@RequestMapping(value="/") //to specify request handling method - like service
	public String renderLoginPage() {
		System.out.println("in render login page");
		return "/login";//AVN - /WEB-INF/views/login.jsp
	}

}
