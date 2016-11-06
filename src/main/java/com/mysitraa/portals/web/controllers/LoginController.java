package com.mysitraa.portals.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rubiklife.bo.DietitianBO;
import com.rubiklife.bo.MemberBO;
import com.rubiklife.entities.Dietitian;
import com.rubiklife.entities.Member;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.DietitianRepository;
import com.rubiklife.repositories.MemberRepository;
import com.rubiklife.service.DietitianService;
import com.rubiklife.service.MemberFacade;

@Controller
public class LoginController {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private MemberFacade memberFacade;
	

	@Autowired
	private DietitianRepository dietitianRepository;
	
	@Autowired
	private DietitianService dietitianService;

	@RequestMapping("login.htm")
	public String loadLoginPage(){
		return "login";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
	@RequestMapping("authenticate.htm")
	public String validateLoginInput(HttpServletRequest request, @RequestParam("user") String user, @RequestParam("email") String emailId){
		
		
		if(user!=null){
			if(user.equalsIgnoreCase("member")){
				Member member = memberRepository.findByEmail(emailId);
				if( member == null ){
					return "redirect:login.htm?error=Email id not found";	
				}
				
				MemberBO memberBO = memberFacade.getMemberBO(member);
				request.getSession().setAttribute("memberInfo", memberBO );
				
				return "redirect:welcome.htm?member=true";
			}else if(user.equalsIgnoreCase("dietitian")){
					Dietitian dietitian = dietitianRepository.findByEmail(emailId);
					if( dietitian == null ){
						return "redirect:login.htm?error=Email id not found";	
					}
					
					DietitianBO dietitianBO = dietitianService.getDietitianBO(dietitian);
					request.getSession().setAttribute("dietitianInfo", dietitianBO );
				
				return "redirect:welcome.htm?member=false";
			}
		}
		return "redirect:login.htm?error=Please select member type";	
	}
	
	@RequestMapping("welcome.htm")
	public String loadwelcomePage(){
		return "welcome";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
	@RequestMapping("register.htm")
	public String loadregisterPage(){
		return "redirect:welcome.htm#/infoForm";	//load welcome page instead of login page for now. During full blown implementation send correct login page
	}
	
	@RequestMapping("logout.htm")
	public String logout(HttpServletRequest request){
		
		request.getSession().removeAttribute("memberInfo");
		request.getSession().removeAttribute("dietitianInfo");
		
		return "redirect:login.htm";	
	}
	
	
	
}
