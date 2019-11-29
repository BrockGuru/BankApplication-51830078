 package com.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(path="/bank")
public class BankController {
	
	
	@GetMapping(path="home")
	public ModelAndView  admin(ModelAndView mv)
	{
		mv.setViewName("home");
		return mv;
		
	}
	/*@GetMapping(path="/admin")
	public String user_mgmt()
	{
		return "admin";
		
	}*/
	@GetMapping(path="mgr")
	public String mgr()
	{
		return "hello mgr";
		
	}
	/*@GetMapping(path="clerk")
	public String transaction()
	{
		return "hello clerk";
		
	}*/

}
