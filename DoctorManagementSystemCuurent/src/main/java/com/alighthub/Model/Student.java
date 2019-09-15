package com.alighthub.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
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
	public String getSroll() {
		return sroll;
	}
	public void setSroll(String sroll) {
		this.sroll = sroll;
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentID")
	private int studentid;
	@Column(name = "StudentName")
	private String studentname;
	@Column(name = "Address")
	private String address;
	@Column(name = "Email")
	private String email;
	@Column(name = "MobileNo")
	private int mbo;
	@Column(name = "StudentRoll")
	private String sroll;
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
