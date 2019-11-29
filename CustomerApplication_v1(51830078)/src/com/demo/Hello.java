package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class Hello {
	@RequestMapping(value="hi",method=RequestMethod.GET)
public ModelAndView hello(ModelAndView mv)
{
		mv.setViewName("hello");
		mv.addObject("key","Spring mvc hello");
		
	return mv;
	
}
}
