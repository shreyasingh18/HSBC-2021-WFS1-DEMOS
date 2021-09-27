package com.hsbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("v1")   // http://ip:port/app-name/spring/v1
public class DemoController {

	//http://ip:port/app-name/spring/v1/greet
	@RequestMapping(path = "greet", method = RequestMethod.GET)
	public ModelAndView greetings() {
		// here you need to call service layer methods
		ModelAndView mav = new ModelAndView("welcome", "key", "Welcome to spring web");
		return mav;
	}
}
