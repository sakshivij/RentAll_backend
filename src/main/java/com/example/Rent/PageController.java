package com.example.Rent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

	@RequestMapping("/")
	public String welcome() {
		
		/*
		  
		  ModelAndView modelAndView = new ModelAndView();
    	  modelAndView.setViewName("index");
    	  return modelAndView;
		 
		 */
		return "home";
	}
	
	
}
