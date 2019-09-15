package com.webcorestone.DMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.DMS.model.DoctorDetails;
import com.webcorestone.DMS.serviceI.DoctorServiceI;

@RestController
@RequestMapping("/doctors")
public class DoctorController
{
	
	@Autowired
	private  DoctorServiceI drservice;
	
	public int addDoctors( @RequestBody DoctorDetails doctorDetails) 
	{
		return drservice.addDoctors(doctorDetails);
	}
	
}
