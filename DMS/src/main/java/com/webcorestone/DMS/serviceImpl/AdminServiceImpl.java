package com.webcorestone.DMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webcorestone.DMS.daoI.AdminDaoI;
import com.webcorestone.DMS.model.AdminDetails;
import com.webcorestone.DMS.serviceI.AdminServiceI;

@Service
public class AdminServiceImpl implements AdminServiceI {

	@Autowired
	private AdminDaoI adminDao;
	
	/*
	 * @Autowired private LoginDao loginDao;
	 * 
	 * 
	 */
	

	@Override
	public void addAdmin(AdminDetails adminDetails) {
		adminDao.save(adminDetails);

	}

	@Override
	public AdminDetails loginAdmin(int loginId) {
		

		return adminDao.findByloginLoginId(loginId);
	}

}
