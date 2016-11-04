package com.mysitraa.portals.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubiklife.repositories.AddressRepository;

@Controller
public class LoginController {
	
	@Autowired
	private AddressRepository addressRepository;

	@RequestMapping("login.htm")
	public String loadLoginPage(){
		System.out.println(addressRepository);
		return "login";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
	@RequestMapping("welcome.htm")
	public String loadwelcomePage(){
		System.out.println(addressRepository);
		return "welcome";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
	@RequestMapping("register.htm")
	public String loadregisterPage(){
		System.out.println(addressRepository);
		return "redirect:welcome.htm#/infoForm";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
}
