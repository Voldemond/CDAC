package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory, it represents a spring bean containing HTTP request handling
//singleton n eager
public class HomePageController {
  public HomePageController() {
          System.out.println("in ctor" +getClass());
  }
  //Add request handling method of render the index page
  //URL-http://host:port/ctx_path/
  @RequestMapping("/") //to specify request handling method - like service
  public String renderHomePage() {
      System.out.println("in render home page");
      return "/index";//Logical view name
  }
}