package com.springlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = "/printHello",method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework 1!");
		return "hello";
	}
	
	@RequestMapping(value = "/printHelloTwo", method = RequestMethod.GET)
	public String printHelloTwo(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework 2!");
		return "hello";
	}
}
