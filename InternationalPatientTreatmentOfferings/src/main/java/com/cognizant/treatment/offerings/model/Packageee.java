package com.cognizant.treatment.offerings.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Packageee {

	@Override
	public String toString() {
		return "Packageee [id=" + id + ", packageName=" + packageName + ", testDetails=" + testDetails + ", cost="
				+ cost + ", duration=" + duration + "]";
	}
	private int id;
	private String packageName;
	private String testDetails;
	private double cost;
	private int duration;
	private AilmentModel ailment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getTestDetails() {
		return testDetails;
	}
	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public AilmentModel getAilment() {
		return ailment;
	}
	public void setAilment(AilmentModel ailment) {
		this.ailment = ailment;
	}
	
	
	
}
