package com.cognizant.treatment.proxy;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AilmentModel {

	

	

	private int id;
	private String name;
	private List<SpecialistDetailsModel> doctors = new ArrayList<>();

	
}
