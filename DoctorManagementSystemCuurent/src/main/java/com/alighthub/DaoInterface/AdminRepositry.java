package com.alighthub.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alighthub.Model.Admin;

public interface AdminRepositry  extends JpaRepository<Admin, Integer>{

	public void insertData(Admin a);
}

