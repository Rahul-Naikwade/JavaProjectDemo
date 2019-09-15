package com.alighthub.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor_Details")
public class Doctor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DoctorID")
	private int doctorid;
	@Column(name = "DoctorName")
	private String doctorname;
	@Column(name = "Address")
	private String address;
	@Column(name = "Email")
	private String email;
	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
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

	public String getDroll() {
		return droll;
	}

	public void setDroll(String droll) {
		this.droll = droll;
	}

	public int getLicenseno() {
		return licenseno;
	}

	public void setLicenseno(int licenseno) {
		this.licenseno = licenseno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
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

	@Column(name = "MobileNo")
	private int mbo;
	@Column(name = "DoctorRoll")
	private String droll;
	@Column(name = "LicenseNo")
	private int licenseno;
	@Column(name = "Gender")
	private String gender;
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "Specilization")
	private String specilization;
	@Column(name = "qulification")
	private String qulification;
	@OneToOne(cascade = CascadeType.ALL)
	//@Column(name = "Login")
	private Login login;
	
	@Column(name = "Department")
	private String department;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@Column(name = "Student_List")
	private List<Student> student;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@Column(name = "Nurse_List")
	private List<Nurse> nurse;
}

