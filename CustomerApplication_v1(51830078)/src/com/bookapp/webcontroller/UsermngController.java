package com.bookapp.webcontroller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookapp.persistence.Customer;
import com.bookapp.persistence.User;
import com.bookapp.persistence.UserNotFoundException;
import com.bookapp.service.UserService;

@Controller
public class UsermngController {
	@Autowired
	private UserService userService;
	
	//@PostConstruct
	public void init()
	{
		userService.addUser(new User("guru","guru@gmail.com", "123", "engineer", true));
		userService.addUser(new User("gaja","gaja@gmail.com", "1234", "developer", true));
		userService.addUser(new User("chandru","chandru@gmail.com", "12345", "admin", true));
		
		
		
	}
	@RequestMapping(value="login")
public String loginGet(HttpServletRequest req,ModelMap map)
{
	map.addAttribute("userbean",new UserFormBean());
	map.addAttribute("error",req.getParameter("error"));
	return "login";
}
	@RequestMapping(value="logout")
	public String logoutGet(HttpServletRequest req,ModelMap map)
	{
		map.addAttribute("userbean",new UserFormBean());
		map.addAttribute("message",req.getParameter("Your successfully logout"));
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String loginPost(HttpServletRequest req,@Valid @ModelAttribute(value="userbean") UserFormBean userbean,BindingResult bindingRes)
	{
		User user=null;
		if(bindingRes.hasErrors())
		{
			System.out.println("hey chill");
		return "redirect:login";
		}
		else
		{
			try
			{
				user=userService.getUserByEmail(userbean.getEmail(),userbean.getPassword());
			}
			catch(UserNotFoundException e)
			{
				return "redirect:login?error=log in not valid";
			}
			HttpSession session=req.getSession();
			session.setAttribute("user",user);
					return "redirect:allCustomer";
			
		}
		
	}
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String registerUserGet(ModelMap map)
	{
		map.addAttribute("reg",new User());
		return "register";
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String regUserPost(User user)
	{
		
	userService.addUser(user);
		return "redirect:login";
	}
}
