package com.techwave.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Hello()
	{
		return "home";
	}
	@RequestMapping("/sendString")
	public String sendString(Model M)
	{
		String Str="Welcome to Spring MVC";
		M.addAttribute("msg",Str);
		return "receiveString";
	}
	@RequestMapping("/sendString1")
	public ModelAndView sendString1()
	{
		String Str="Welcome to Spring MVC with Model and View";
		ModelAndView M=new ModelAndView("receiveString");
		M.addObject("msg",Str);
		return M;
		
	}
	@RequestMapping("/sendList")
	public String sendList(Model M)
	{
		List<String> L=Arrays.asList("Praveen","Mounika","Manasa","Nikil");
		M.addAttribute("list",L);
		return "receiveList";
	}
	
	
}
