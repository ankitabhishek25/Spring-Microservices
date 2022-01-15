package com.cognizant.treatment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patientdetail")
public class PatientDetail {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String ailment;
	@Column
	private String treatmentpackagename;
	@Column
	private String treatmentcommencementdate;
	@OneToOne(mappedBy = "patientdetail")
	private TreatmentPlan treatmentplan;

}
