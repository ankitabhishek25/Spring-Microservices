package com.cognizant.treatment.proxy;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Packageee {

	


	private int id;
	private String packageName;
	private String testDetails;
	private int cost;
	private int duration;
	private AilmentModel ailment;

	
}
