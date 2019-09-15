package com.webcorestone.DMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.serviceI.LoginService;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService logSer;

	@GetMapping("/loginbyunameandpass/{loginUserName}/{loginPassword}")
	public LoginDetails login(@PathVariable String loginUserName, @PathVariable String loginPassword) 
	{
		return logSer.loginUnP(loginUserName, loginPassword);
	}

}
