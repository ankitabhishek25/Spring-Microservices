package com.cognizant.treatment.proxy;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentPlanProxy {
	
	private int id;
private String packagename;
	
	private String testdetails;
	
	private int cost;
	
	private String specialist;
	
	private String treatmentcommencementdate;
	private String treatmentEndDate;
	
	
}
