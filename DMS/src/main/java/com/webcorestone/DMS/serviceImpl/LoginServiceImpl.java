package com.webcorestone.DMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.DMS.daoI.LoginDao;
import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.serviceI.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao; 
	
	@Override
	public LoginDetails loginUnP(String userName, String password) {

		return loginDao.findByLoginUserNameAndLoginPassword(userName, password);
	}

}
