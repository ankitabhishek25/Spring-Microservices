package com.cognizant.treatment.offerings.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SpecialistDetailsModel {
	
	

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

	public String getAreaofExperties() {
		return areaofExperties;
	}

	public void setAreaofExperties(String areaofExperties) {
		this.areaofExperties = areaofExperties;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getExperiences() {
		return experiences;
	}

	public void setExperiences(int experiences) {
		this.experiences = experiences;
	}

	@Override
	public String toString() {
		return "SpecialistDetailsModel [id=" + id + ", name=" + name + ", areaofExperties=" + areaofExperties
				+ ", contactNo=" + contactNo + ", experiences=" + experiences + "]";
	}

	private int id;

	private String name;

	private String areaofExperties;

	private String contactNo;
	
	private int experiences;

	
}
