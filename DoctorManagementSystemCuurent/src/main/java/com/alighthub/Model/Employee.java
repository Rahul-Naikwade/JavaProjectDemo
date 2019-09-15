package com.alighthub.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ch.qos.logback.core.net.LoginAuthenticator;

@Entity
@Table(name = "Employee_Details")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private int employeeid;
	@Column(name = "EmployeeName")
	private String employeename;
	@Column(name = "Address")
	private String address;
	@Column(name = "Email")
	private String email;
	@Column(name = "MobileNo")
	private int mbo;
	@Column(name = "EmployeeRoll")
	private String eroll;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "JoingDate")
	private String joingdate;
	@Column(name = "Salary")
	private long salary;
	@Column(name = "qulification")
	private String qulification;
	
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
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

	public String getEroll() {
		return eroll;
	}

	public void setEroll(String eroll) {
		this.eroll = eroll;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoingdate() {
		return joingdate;
	}

	public void setJoingdate(String joingdate) {
		this.joingdate = joingdate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Nurse> getNurse() {
		return nurse;
	}

	public void setNurse(List<Nurse> nurse) {
		this.nurse = nurse;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Column(name = "DotorList")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Doctor> doctor;
	
	@OneToMany(cascade = CascadeType.ALL)
	@Column(name = "StudentList")
	private List<Student> student;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(name = "NurseList")
	private List<Nurse> nurse;
	
	@OneToOne(cascade = CascadeType.ALL)
//	@Column(name = "Login")
	private Login login;
	
	
}
