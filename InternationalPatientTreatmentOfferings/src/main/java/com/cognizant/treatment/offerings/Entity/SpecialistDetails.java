package com.cognizant.treatment.offerings.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specialistdetails")
@Entity
public class SpecialistDetails {
	@Id
	private int id;

	private String name;

	private String areaofExperties;

	private String contactNo;

	private int experiences;
	@ManyToOne
	@JoinColumn(name = "ailment_id")
	private Ailment ailment;

}
