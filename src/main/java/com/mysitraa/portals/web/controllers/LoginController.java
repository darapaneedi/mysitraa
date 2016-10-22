package com.mysitraa.portals.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login.htm")
	public String loadLoginPage(){
		
		return "welcome";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
}
