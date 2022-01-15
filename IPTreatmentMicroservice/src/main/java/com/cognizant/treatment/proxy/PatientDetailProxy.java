package com.cognizant.treatment.proxy;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientDetailProxy {

	

	private int id;

	private String name;

	private int age;

	private String ailment;

	private String treatmentpackagename;
	
	private String treatmentcommencementdate;

	


}
