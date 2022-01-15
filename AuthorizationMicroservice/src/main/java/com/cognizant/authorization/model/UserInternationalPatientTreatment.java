package com.cognizant.authorization.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity(name="user")
public class UserInternationalPatientTreatment {

//	@Id
//	@Column(name="userid")
	private String userid;
//	@Column(name="upassword")
	private String upassword;
//	@Column(name="uname")
	private String uname;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public UserInternationalPatientTreatment(String userid, String upassword, String uname) {
		super();
		this.userid = userid;
		this.upassword = upassword;
		this.uname = uname;
	}
	public UserInternationalPatientTreatment() {
		super();
	}
	@Override
	public String toString() {
		return "UserInternationalPatientTreatment [userid=" + userid + ", upassword=" + upassword + ", uname=" + uname + "]";
	}
	
	
	
	
}
