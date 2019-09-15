package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.LoginDetails;

@Repository
public interface LoginDao extends JpaRepository<LoginDetails, Integer>
{
	LoginDetails findByLoginUserNameAndLoginPassword(String userName, String passsword);
}
