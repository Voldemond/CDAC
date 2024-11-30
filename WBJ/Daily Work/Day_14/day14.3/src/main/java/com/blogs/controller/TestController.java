package com.blogs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // mandatory
@RequestMapping("/test") // optional BUT reco.
public class TestController {
	public TestController() {
		System.out.println("in ctor of " + getClass());
	}

	// add request handling method - to test model n view
	// URL - http://host:port/ctx_path/test/test1
	/*
	 * In HandlerMapping bean key - /test/test1 value -
	 * TestController.testModelAndView
	 */
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("in test model n view");
		// API of o.s.w.s.ModelAndView(String LVN ,
		// String modelAttrName,Object attrValue)
		return new ModelAndView("/test/test1",
				"time_stamp", LocalDateTime.now());
		// AVN - /WEB-INF/views/test/test1.jsp
		/*
		 * Handler rets ModelAndView object --> D.S D.S -> LVN -> V.R(View Resolver) -->
		 * AVN (prefix+LVN+suffix) ->D.S 
		 * D.S checks for model attributes from MnV -->
		 * yes --> D.S --> request.setAttribute(nm,val) --> forwards the clnt -->
		 * JSP(view layer) In JSP : use EL syntax
		 */

	}

	// add request handling method to test Model map i/f
	// URL - http://host:port/ctx_path/test/test2 , method -GET
	@GetMapping("/test2")
	//D.I - SC creates EMPTY map of model attributes n injects it in the method (IoC)
	public String testModelMap(Model modelMap) {
		System.out.println("in test model map "+modelMap);//{}
		// add model attributes
		modelMap.addAttribute("time_stamp", LocalDateTime.now())
		.addAttribute("number_list", List.of(10,20,30,40));
		System.out.println("in test model map "+modelMap);//{.....}
		
		return "/test/test2"; //AVN - /WEB-INF/views/test/test2.jsp
	}
}
