package com.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoController {

	public LogoController()
	{
		System.out.println("this is logo controller");
	}
	
	@RequestMapping("/home")
	public ModelAndView returnHome()
	{
		ModelAndView modelAndView=new ModelAndView("Home");
		return modelAndView;
	}
	
	@RequestMapping("/founder")
	public ModelAndView companyFounder()
	{
		ModelAndView modelAndView=new ModelAndView("founder");
		return modelAndView;
	}
	
}
