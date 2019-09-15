package com.webcorestone.DMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.DMS.daoI.DoctorDaoI;
import com.webcorestone.DMS.model.DoctorDetails;
import com.webcorestone.DMS.serviceI.DoctorServiceI;

@Service
public class DoctorServiceImpl implements DoctorServiceI {

	@Autowired
	private DoctorDaoI drDao;

	@Override
	public int addDoctors(DoctorDetails doctorDetails)
	{
		drDao.save(doctorDetails);
		return doctorDetails.getDoctorId();
	}

}
