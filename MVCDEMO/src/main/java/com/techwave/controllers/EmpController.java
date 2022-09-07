package com.techwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.techwave.model.pojo.Emp;
@SessionAttributes("username")
@Controller

public class EmpController {
//Step1
	@RequestMapping("/insert")
	public String Insert() {
		
		return "insert";
	}
	@RequestMapping("/getemp")
	public String getemp(@ModelAttribute("E") Emp  emp ) {
		System.out.println(emp.getEmpno()+ " "+emp.getEname()+ emp.getGender()+ emp.getDob()+emp.getBasic());
		return "insert";
	}
	
	@RequestMapping("/insert1")
	public String Insert1() {
		
		return "insert1";
	}
	@RequestMapping("/getemp1")
	public String getemp1(@RequestParam("eno") int eno,@RequestParam("en") String en,
			@RequestParam("g") String g,@RequestParam("db") String db,@RequestParam("b") double b) {
		System.out.println(eno+ " "+en+ g+ db+b);
		return "insert";
	}
	@RequestMapping("/test")
	public String test(Model M)
	{
		System.out.println(M.getAttribute("username"));
		//status.setComplete();
		return "test";
	}
	
	
}












