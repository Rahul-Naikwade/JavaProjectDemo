package com.alighthub.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login_Details")
public class Login
{
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getStuts() {
		return stuts;
	}
	public void setStuts(String stuts) {
		this.stuts = stuts;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Id
	@Column(name = "LoginId")
	private int loginid;
	@Column(name = "UserName")
	private String uname;
	@Column(name = "Password")
	private String pass;
	@Column(name = "Status")
	private String stuts;
	@Column(name = "Roll")
	private int roll;

}
