package com.bankapp.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.User;
import com.bankapp.model.exceptions.UserNotFoundException;
import com.bankapp.model.repository.UserRepository;
import com.bankapp.model.service.UserService;
import com.mysql.cj.conf.BooleanPropertyDefinition;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private UserRepository userrepo;
	@GetMapping(path="admin")
	public ModelAndView usermanagement(ModelAndView mv)
	{
		mv.setViewName("admin");
		mv.addObject("users", userservice.findAll());
		return mv;
		
	}
	@GetMapping(path="/addUser")
	public String addUserget(ModelMap mm)
	{
		mm.addAttribute("user", new User());
		return "addUser";
		
	}
	@PostMapping(path="/addUser")
	public String addUserPost( User user,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "addUser";
		}
		if(user.getId()==null)
		{
			userservice.addUser(user);
		}
		else
		{
			userservice.updateUser(user);
		}
		
				
			
			
		return "redirect:admin";
	}
	
	@ModelAttribute("roles")
	public List<String>getRoles()
	{
		List<String>roles=new ArrayList<>();
		roles.add("ROLE_ADMIN");
		roles.add("ROLE_MGR");
		roles.add("ROLE_CLERK");
		return roles;
		
	}
	@RequestMapping(value="/delete")
	public String deleteUser(HttpServletRequest req)
	{
		long id=Long.parseLong(req.getParameter("id"));
		
		userservice.deleteUser(id);
		return "redirect:admin";
		
	}
	@RequestMapping(value="/update")
	public String UpdateUser(HttpServletRequest req,ModelMap mm)
	{
		long id=Long.parseLong(req.getParameter("id"));
		User user=userrepo.findById(id).orElseThrow(UserNotFoundException::new);
		mm.addAttribute("user",user);
	
		return "addUser";
		
	}

}
