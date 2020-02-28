package com.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ekart.Dao.ConnectingToDB;
import com.ekart.model.User;

@Controller
public class HomeController {
	
	public HomeController(){
		
		System.out.println("this is at home controller");
	}
	
	@RequestMapping("/register")
	public ModelAndView registration()
	{
		User user=new User();
		user.setUserName("xyz");user.setPassword("123");user.setEmail("xyz@xyz.com");user.setMobileNo(0000);
		ModelAndView modelAndView=new ModelAndView("registration");
		modelAndView.addObject("usr", user);
		return modelAndView;
	}

	@PostMapping("/carryuserinfo")
	public ModelAndView userinfo(@ModelAttribute("usr") User user)
	{
		ConnectingToDB toDB=new ConnectingToDB();
		toDB.getConnection(user);
		ModelAndView view=new ModelAndView("Home");
		return view;
	}
}
