package com.webcorestone.DMS.serviceI;
import com.webcorestone.DMS.model.AdminDetails;


public interface AdminServiceI {
	
	public void addAdmin(AdminDetails adminDetails );
	public  AdminDetails loginAdmin(int loginId);


}
