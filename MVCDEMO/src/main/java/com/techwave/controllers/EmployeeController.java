package com.techwave.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techwave.model.dao.EmpDAO;
import com.techwave.model.pojo.Emp;
import com.techwave.model.pojo.validateEmp;

@Controller
public class EmployeeController {
@Autowired
EmpDAO empDao;	
//USING STATEMENT
@RequestMapping("insertEmp")
public String insertEmp()
{
 return "insert";	
}

@RequestMapping("getEmp")
public String getEmp(@ModelAttribute("E") Emp E,Model M)
{
	String S=empDao.insertEmp(E);
	M.addAttribute("msg",S);
	return "insert";	
}

//USING PREPARED STATEMENT

@RequestMapping("insertEmpps")
public String insertEmpps()
{
 return "insertPS";	
}
@RequestMapping("getEmpPS")
public String getEmpPS(@ModelAttribute("E") Emp E,Model M)
{
	String S=empDao.insertEmpPS(E);
	M.addAttribute("msg",S);
	return "insertPS";	
}
@RequestMapping("getEmpDetails")
public String getEmpDetails()
{
	
return "Empdetails";
}
@RequestMapping("GetDetails/{empno}")
public String Getdetails(@PathVariable("empno") String empno,Model M)
{
	System.out.println(empno);
	Emp E=empDao.getEmpDetails(Integer.parseInt(empno));
	
	
	
	M.addAttribute("E",E);
	
	return "Empdetails"	;
}
@RequestMapping("Validation")
public String ValidateData(Model M)
{
	M.addAttribute("emp",new validateEmp());
	return "Validate";
}

@RequestMapping("getValidateEmp")
public String getValidateEmp(@Valid @ModelAttribute("emp") validateEmp emp,BindingResult bs)
{
	if(bs.hasErrors())
	{
		return "Validate";
	}
	else
	{	
	System.out.println(emp);
		return "home";

	}}


















}
