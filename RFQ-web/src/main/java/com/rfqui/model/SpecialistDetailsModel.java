package com.rfqui.model;



public class SpecialistDetailsModel {
	
	private int Id;

	private String Name;

	private String AreaofExperties;

	private String contactNo;
	
	private int experiences;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAreaofExperties() {
		return AreaofExperties;
	}

	public void setAreaofExperties(String areaofExperties) {
		AreaofExperties = areaofExperties;
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
	
	
	

}
