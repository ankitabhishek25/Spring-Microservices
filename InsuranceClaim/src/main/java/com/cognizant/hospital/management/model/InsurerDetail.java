package com.cognizant.hospital.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
// model class
public class InsurerDetail {

	@Id
	private String insurerName;
	private String insurerPackageName;
	private double insuranceAmountLimit;
	private double disbursementDuration;
	

	//constructor without param
	public InsurerDetail() {
		super();
	}
	//constructor with param
	public InsurerDetail(String insurerName, String insurerPackageName, double insuranceAmountLimit,
			double disbursementDuration) {
		super();
		this.insurerName = insurerName;
		this.insurerPackageName = insurerPackageName;
		this.insuranceAmountLimit = insuranceAmountLimit;
		this.disbursementDuration = disbursementDuration;
	}
	
	
}


