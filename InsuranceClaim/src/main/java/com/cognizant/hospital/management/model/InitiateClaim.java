package com.cognizant.hospital.management.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class InitiateClaim {
	@Id
	private String patientName;
	private String ailment;
	private String treatmentPackageName;
	private String insurerName;
	

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
	

	
	
}
