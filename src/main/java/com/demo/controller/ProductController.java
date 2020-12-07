package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Product;
import com.demo.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/viewproduct")
	public ModelAndView DisplayProduct()
	{
		List<Product> plist=productService.getallProduct();
		return new ModelAndView("displayProduct", "plist",plist);
	}
	@RequestMapping("/showform")
	public ModelAndView ShowProduct() {
		
		return new ModelAndView("addProduct");
	}
	
	@RequestMapping("/editproduct/{id}")
	public ModelAndView editProduct(@PathVariable("id")int pid) {
		Product p=productService.getProductById(pid);
		return new ModelAndView("editProduct","p",p);
	}
	
	@RequestMapping(value="/updateproduct",method=RequestMethod.POST)
	public ModelAndView updateProduct(@RequestParam("prodid")int pid,@RequestParam("prodname")String pname,@RequestParam("price")double price) {
		Product p=new Product(pid,pname,price);
		productService.update(p);
		return new ModelAndView("redirect:/viewproduct");
		}
		
	@RequestMapping("/deleteproduct/{id}")
	public ModelAndView deleteProduct(@PathVariable("id")int pid) {
		productService.deleteById(pid);
		return new ModelAndView("redirect:/viewproduct");
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public ModelAndView AddProduct(@RequestParam("prodid")int pid,@RequestParam("prodname")String pname,@RequestParam("price")double price) {
	Product p=new Product(pid,pname,price);
		productService.addProduct(p);
		return new ModelAndView("redirect:/viewproduct");
	}
	}	

