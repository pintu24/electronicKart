package com.ekart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ekart.Dao.ConnectingToDB;
import com.ekart.Dao.LoginDao;
import com.ekart.model.User;

@Controller
public class LoginController {
	
	@Autowired
	LoginDao loginDao;
	
	public LoginController()
	{
		System.out.println("at login controller");
	}

	@RequestMapping("/loggingin")
	public ModelAndView logIn()
	{
		User user=new User();
		user.setUserName("abc");
		ModelAndView view=new ModelAndView("login");
		view.addObject("log",user);
		return view;
	}
	
	@PostMapping("/carrylogin")
	
	public String carryLogIn(@ModelAttribute("log") User user)
	{
		User s=loginDao.testLogin(user);
		if(s!=null) 
		{
			if(s.getRole().equals("ROLE_ADMIN")) 
			{
		        return "Home";
			}
			
			if(s.getRole().equals("ROLE_USER"))
			{
				return "userHome";
			}
		}
		else
		{
			return "redirect:loggingin";
		}
		return "";
	}
}
