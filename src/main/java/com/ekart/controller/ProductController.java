package com.ekart.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ekart.Dao.ProductDao;
import com.ekart.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	public ProductController() {
		System.out.println("this is product controller");
	}
	
	@GetMapping("/home")
	public String Return()
	{
		return"Home";
	}
	
	@RequestMapping("/displayproducts")
	public ModelAndView allProducts()
	{
		Product product=new Product(420,"5Star","really chocolatte",15);
		Product product2=new Product(520,"Munch","really crunchy",10);
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(product);
		list.add(product2);
		ModelAndView view=new ModelAndView("showproducts");
		view.addObject("prolist", list);
		return view;
	}
	
	@RequestMapping("/addproduct")
	public ModelAndView addingproducts()
	{
		Product product=new Product(000, "abc", "blablabla", 999);
		ModelAndView modelAndView=new ModelAndView("addingproduct");
		modelAndView.addObject("prolist", product);
		return modelAndView;
	}
	
	@PostMapping("/carryproduct")
	public ModelAndView carryingProductInfo(@ModelAttribute("prolist") Product product)
	{
		
		productDao.insertProduct(product);
		ModelAndView view=new ModelAndView("Home");
		return view;
	}
}
