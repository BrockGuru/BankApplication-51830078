package com.bookapp.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.persistence.Customer;
import com.bookapp.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
private CustomerService service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(ModelMap map)	{
		return "redirect:login";
	}
	@RequestMapping(value="allCustomer",method=RequestMethod.GET)
	public ModelAndView allCustomer(ModelAndView mv)
	{
		mv.setViewName("allCustomer");
		mv.addObject("Customer",service.getAllCustomer());
		return mv;
	}
	@RequestMapping(value="addcustomer",method=RequestMethod.GET)
	public String addCustomerGet(ModelMap map)
	{
		map.addAttribute("customer",new Customer());
		return "addcustomer";
	}
	@RequestMapping(value="addcustomer",method=RequestMethod.POST)
	public String addcustomerPost(@Valid Customer customer,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "addcustomer";
		}
		else
		{
			if(customer.getId()==0)
			{
				service.addCustomer(customer);
			}
			else
			{
				service.updateCustomer(customer);
			}
		}
		return "redirect:allCustomer";
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteCustomer(HttpServletRequest req)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		service.removeCustomer(id);
		return  "redirect:allCustomer";
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String updateCustomer(HttpServletRequest req,ModelMap map)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		Customer customerToBeUpdate=service.getUserById(id);
		map.addAttribute("customer",customerToBeUpdate);
		return  "addcustomer";
	}
	
	
}
