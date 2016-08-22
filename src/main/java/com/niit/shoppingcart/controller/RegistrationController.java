package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;


@Controller
public class RegistrationController {
	
	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@Autowired
	UserDetails userDetails;
	
	
	@RequestMapping("home")
	public String home(){
		return "index";
		
	}
	
	@RequestMapping("home")
	public String registerUser(@ModelAttribute UserDetails userDetails){
		System.out.println("registerUser");
		userDetailsDAO.saveOrUpdate(userDetails);
		return "index";
		
		
	}
	
	
	

}
