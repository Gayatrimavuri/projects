package com.techwave.controllers;

import com.techwave.model.pojo.Login;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"username","type"})

public class LoginController {
	@RequestMapping("/login")
	public String Login(Model M) {
		Login L = new Login();
		M.addAttribute("login", L);
		return "Login";
	}

	@RequestMapping("/getLogin")
	public String getLogin(@Valid @ModelAttribute("login") Login login, BindingResult bs,Model M) {
		if (bs.hasErrors())
			return "Login";
		else
		{
			if(login.getUsername().equals("techwave") && login.getPassword().equals("admin"))
			{
				M.addAttribute("username",login.getUsername());
				return "test";
			}
				else
			{
				M.addAttribute("msg","Invalid Credentials");
				return "Login";
			}
			}
		}
	
	@RequestMapping("/logout")
	public String logout(SessionStatus session)
	{
		session.setComplete();
		return "Logout";
		
	}
	
	

}
