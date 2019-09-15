package com.alighthub.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alighthub.Model.Employee;
import com.alighthub.Model.Login;

public interface LoginRepositry  {
	
	public Login loginCheck();
	
	//public void addData(Employee e);

}
