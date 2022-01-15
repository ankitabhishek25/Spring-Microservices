package com.cognizant.treatment.offerings.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class AilmentModel {

	private int id;
	private String name;
	private List<SpecialistDetailsModel> doctors = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SpecialistDetailsModel> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<SpecialistDetailsModel> doctors) {
		this.doctors = doctors;
	}

}
