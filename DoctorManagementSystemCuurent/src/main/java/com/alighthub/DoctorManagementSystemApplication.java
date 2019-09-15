package com.alighthub;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorManagementSystemApplication {

   // public	static Logger log = LogManager.getLogger(DoctorManagementSystemApplication.class); 
	public static void main(String[] args) {
		
		SpringApplication.run(DoctorManagementSystemApplication.class, args);
		
		System.out.println("Hello User-----");
		
	}

}
