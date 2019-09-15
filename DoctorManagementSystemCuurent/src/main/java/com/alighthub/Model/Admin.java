package com.alighthub.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin
{
	@Id
	@Column(name = "AdminID")
	private int adminid;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAdminstatus() {
		return adminstatus;
	}
	public void setAdminstatus(String adminstatus) {
		this.adminstatus = adminstatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
	@Column(name =  "AdminName")
	private String adminName;
	@Column(name = "Email")
	private String email;
	@Column(name = "MobileNo")
	private String mobileno;
	@Column(name =  "AdminStatus")
	private String adminstatus;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Address")
	private String address;
	@Column(name = "PinCode")
	private int pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@Column(name = "Login")
	private Login login;
//	@OneToMany(cascade = CascadeType.ALL)
//	@Column(name = "Employee")
//	private List<Employee> employee;
	
	
}
