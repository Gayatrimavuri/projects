package com.techwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SampleController {

	@RequestMapping("/homepage")
	public String Demo()
	{
		return "Second";
	}
	
}
