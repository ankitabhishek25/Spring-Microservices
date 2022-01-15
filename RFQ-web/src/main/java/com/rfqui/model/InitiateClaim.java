package com.rfqui.model;





public class InitiateClaim {


	public InitiateClaim() {
		super();
	}
	public InitiateClaim(String patientName, String ailment, String treatmentPackageName, String insurerName) {
		super();
		this.patientName = patientName;
		this.ailment = ailment;
		this.treatmentPackageName = treatmentPackageName;
		this.insurerName = insurerName;
	}
	private String patientName;
	private String ailment;
	private String treatmentPackageName;
	private String insurerName;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAilment() {
		return ailment;
	}
	public void setAilment(String ailment) {
		this.ailment = ailment;
	}
	public String getTreatmentPackageName() {
		return treatmentPackageName;
	}
	public void setTreatmentPackageName(String treatmentPackageName) {
		this.treatmentPackageName = treatmentPackageName;
	}
	public String getInsurerName() {
		return insurerName;
	}
	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}
	

	
	
}
