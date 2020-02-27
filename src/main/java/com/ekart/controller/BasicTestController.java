package com.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicTestController 
{
	
	public BasicTestController() {
		
		System.out.println("at basic test controller");
	}
	@RequestMapping("/hello")
	public String greeting()
	{
		System.out.println("this is friday");
		return"welcome";
	}
	
	@GetMapping("/details")
	public String greeting2()
	{
		return"founder";
	}
}
