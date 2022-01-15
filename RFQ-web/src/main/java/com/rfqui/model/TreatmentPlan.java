
package com.rfqui.model;


//@Data

public class TreatmentPlan {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public String getTestdetails() {
		return testdetails;
	}
	public void setTestdetails(String testdetails) {
		this.testdetails = testdetails;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getTreatmentcommencementdate() {
		return treatmentcommencementdate;
	}
	public void setTreatmentcommencementdate(String treatmentcommencementdate) {
		this.treatmentcommencementdate = treatmentcommencementdate;
	}
	public String getTreatmentEndDate() {
		return TreatmentEndDate;
	}
	public void setTreatmentEndDate(String treatmentEndDate) {
		TreatmentEndDate = treatmentEndDate;
	}
	public PatientDetail getPatientdetail() {
		return patientdetail;
	}
	public void setPatientdetail(PatientDetail patientdetail) {
		this.patientdetail = patientdetail;
	}
	
	private int id;
	
	private String packagename;
	
	private String testdetails;
	
	private int cost;

	private String specialist;
	
	private String treatmentcommencementdate;
	private String TreatmentEndDate;
	private PatientDetail patientdetail;

}
