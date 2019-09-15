package com.webcorestone.DMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.DMS.model.AdminDetails;
import com.webcorestone.DMS.serviceI.AdminServiceI;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminServiceI ser;

	@PostMapping("/add")
	public String addAdmin(@RequestBody AdminDetails adminDetails) 
	{
		
		/*
		 * System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		 * 
		 * DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); String convertedDate =
		 * sdf.format(adminDetails.getDob()); //adminDetails.setDob(convertedDate);
		 * System.out.println(convertedDate);
		 */

	
		  System.out.println(adminDetails.getAdminAadharNo());
		  System.out.println(adminDetails.getAdminEmailId());
		  System.out.println(adminDetails.getAddress().getAddressDistName());
		  System.out.println(adminDetails.getAddress().getAddressId());
		
		ser.addAdmin(adminDetails);
		return "add admin data Successfully";
	}

	@GetMapping("/login/{loginId}")
	public AdminDetails loginAdmin(@PathVariable int loginId) {

		System.out.println("LoginId=" + loginId);
		AdminDetails adminData = ser.loginAdmin(loginId);
		return adminData;
	}

}
