package com.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController(){
		
		System.out.println("this is at home controller");
	}
	
	@RequestMapping("/register")
	public ModelAndView registration()
	{
		ModelAndView modelAndView=new ModelAndView("registration");
		return modelAndView;
	}

	@RequestMapping("/carryuserinfo")
	public ModelAndView userinfo()
	{
		ModelAndView view=new ModelAndView("Home");
		return view;
	}
}
