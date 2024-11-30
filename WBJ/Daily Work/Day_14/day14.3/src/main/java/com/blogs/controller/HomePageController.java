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
	//Key : / 
	//value : HomePageController.renderHomePage
	@RequestMapping(value="/") //to specify request handling method - like service
	public String renderHomePage() {
		System.out.println("in render home page");
		return "/index";//AVN - /WEB-INF/views/index.jsp
	}

}
