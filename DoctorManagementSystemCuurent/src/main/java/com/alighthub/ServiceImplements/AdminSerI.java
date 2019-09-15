package com.alighthub.ServiceImplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.alighthub.DaoInterface.AdminRepositry;
import com.alighthub.Model.Admin;
import com.alighthub.ServiceInterface.AdminService;

@Service
public class AdminSerI implements AdminService{

	
	@Autowired
	private AdminRepositry ar;
	@Override
	public void insertData(Admin a) {
		
		ar.save(a);
		
	}


	

	
}
