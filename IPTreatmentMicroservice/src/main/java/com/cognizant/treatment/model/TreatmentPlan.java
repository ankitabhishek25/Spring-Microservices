
package com.cognizant.treatment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "treatmentplan")
public class TreatmentPlan {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public String getTestdetails() {
		return testdetails;
	}
	public void setTestdetails(String testdetails) {
		this.testdetails = testdetails;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getTreatmentcommencementdate() {
		return treatmentcommencementdate;
	}
	public void setTreatmentcommencementdate(String treatmentcommencementdate) {
		this.treatmentcommencementdate = treatmentcommencementdate;
	}
	public String getTreatmentEndDate() {
		return treatmentEndDate;
	}
	public void setTreatmentEndDate(String treatmentEndDate) {
		this.treatmentEndDate = treatmentEndDate;
	}
	public PatientDetail getPatientdetail() {
		return patientdetail;
	}
	public void setPatientdetail(PatientDetail patientdetail) {
		this.patientdetail = patientdetail;
	}
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String packagename;
	@Column
	private String testdetails;
	@Column
	private int cost;
	@Column
	private String specialist;
	@Column
	private String treatmentcommencementdate;
	private String treatmentEndDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PatientDetail_id")
	private PatientDetail patientdetail;

}
