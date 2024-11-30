package com.blogs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // mandatory
@RequestMapping("/test") // optional but recommended
public class TestController {
	public TestController() {
		System.out.println("in ctor of " + getClass());
	}

	// add request. handling method-to test model n view
	// URL- http://host:port/ctx_path/test/test1
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("in test model n view");
		// API of o.s.w.s ModelAndView(String LVN, String modelAttrName,Object
		// attrValue)
		return new ModelAndView("/test/test1", "time_stamp", LocalDateTime.now());
		// AVN- /WEB-INF/Views/test/test1.jsp
	}
	@GetMapping("/test2")
	public String testModelMap(Model modelMap) {
		System.out.println("in test model map"+modelMap);
		//
		modelMap.addAttribute("time_stamp", LocalDateTime.now())
		.addAttribute("number_list",List.of(10,20,30,40));
		return "/test/test2";
	}
}