package com.alighthub.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Nurse_Details")
public class Nurse 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NursetID")
	private int nurseid;
	@Column(name = "NurseName")
	private String nursename;
	public int getNurseid() {
		return nurseid;
	}
	public void setNurseid(int nurseid) {
		this.nurseid = nurseid;
	}
	public String getNursename() {
		return nursename;
	}
	public void setNursename(String nursename) {
		this.nursename = nursename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMbo() {
		return mbo;
	}
	public void setMbo(int mbo) {
		this.mbo = mbo;
	}
	public String getNroll() {
		return nroll;
	}
	public void setNroll(String nroll) {
		this.nroll = nroll;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQulification() {
		return qulification;
	}
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Column(name = "Address")
	private String address;
	@Column(name = "Email")
	private String email;
	@Column(name = "MobileNo")
	private int mbo;
	@Column(name = "NurseRoll")
	private String nroll;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "qulification")
	private String qulification;
	@OneToOne(cascade = CascadeType.ALL)
	//@Column(name = "Login")
	private Login login;
	
	@Column(name = "Department")
	private String department;


}
