package com.ekart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//this is for admin
	@GetMapping("/home")
	public String Return()
	{
		return"Home";
	}
	
	//this is for user
	@RequestMapping("/userhome")
	public String Return2()
	{
		return"userHome";
	}
	
	@RequestMapping("/displayproducts")
	public ModelAndView allProducts()
	{
		/*
		Product product=new Product(420,"5Star","really chocolatte",15);
		Product product2=new Product(520,"Munch","really crunchy",10);
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(product);
		list.add(product2);
		*/
		List<Product>list=productDao.getProducts();
		ModelAndView view=new ModelAndView("showproducts");
		view.addObject("prolist", list);
		return view;
	}
	
	@RequestMapping("/displayproductsforadmin")
	public ModelAndView allProductsForAdmin()
	{
		/*
		Product product=new Product(420,"5Star","really chocolatte",15);
		Product product2=new Product(520,"Munch","really crunchy",10);
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(product);
		list.add(product2);
		*/
		List<Product>list=productDao.getProducts();
		ModelAndView view=new ModelAndView("showadminproducts");
		view.addObject("prolist", list);
		return view;
	}
	
	@GetMapping("/info")
	public ModelAndView displaySingleProduct(@RequestParam("pid")int proId)
	{
		Product product=productDao.getSingleProduct(proId);
		ModelAndView modelAndView =new ModelAndView("moreinfo");
		modelAndView.addObject("prolist", product);
		return modelAndView;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteProduct(@RequestParam("id")int proId)
	{
		Product product=productDao.deleteProduct(proId);
		ModelAndView modelAndView=new ModelAndView("redirect:displayproductsforadmin");
		modelAndView.addObject("prolist", product);
		return modelAndView;
	}
	
	@RequestMapping("/addproduct")
	public ModelAndView addingproducts()
	{
		Product product=new Product();
		product.setProductId(0);
		product.setProductPrice(0);
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
