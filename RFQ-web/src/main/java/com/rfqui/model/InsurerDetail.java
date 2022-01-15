package com.rfqui.model;

public class InsurerDetail {
	
	public String getInsurerName() {
		return insurerName;
	}
	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}
	public String getInsurerPackageName() {
		return insurerPackageName;
	}
	public void setInsurerPackageName(String insurerPackageName) {
		this.insurerPackageName = insurerPackageName;
	}
	public double getInsuranceAmountLimit() {
		return insuranceAmountLimit;
	}
	public void setInsuranceAmountLimit(double insuranceAmountLimit) {
		this.insuranceAmountLimit = insuranceAmountLimit;
	}
	public double getDisbursementDuration() {
		return disbursementDuration;
	}
	public void setDisbursementDuration(double disbursementDuration) {
		this.disbursementDuration = disbursementDuration;
	}
	public InsurerDetail(String insurerName, String insurerPackageName, double insuranceAmountLimit,
			double disbursementDuration) {
		super();
		this.insurerName = insurerName;
		this.insurerPackageName = insurerPackageName;
		this.insuranceAmountLimit = insuranceAmountLimit;
		this.disbursementDuration = disbursementDuration;
	}
	
	
	private String insurerName;
	private String insurerPackageName;
	private double insuranceAmountLimit;
	private double disbursementDuration;
	

	
}


