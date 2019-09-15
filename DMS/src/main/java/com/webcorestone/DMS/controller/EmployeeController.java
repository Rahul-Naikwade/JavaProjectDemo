package com.webcorestone.DMS.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.DMS.model.EmployeeDetails;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{

	@PostMapping("/add")
	public String addEmployee(@RequestBody EmployeeDetails employeeDetails)
	{
		
		
		return "Addd Employee Successfully";
	}
}
