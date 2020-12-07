package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.user;
import com.demo.service.LoginService;

@Controller
public class LoginController {
	@Autowired
   public LoginService loginService;

	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public ModelAndView validateUser(@RequestParam("uname") String name,@RequestParam("pass") String pass) {
		user n=loginService.validate(name,pass);
		String msg=null;
		if(n!=null) {
			msg="valid user";
		}
		else
		{
			msg="invalid user";
		}
	return new ModelAndView("displayMessage","msg",msg);
	}
	
}
