package com.cognizant.treatment.offerings.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Table(name = "packagedetails")
@Entity
@Data
public class PackageDetails {
	@Id
	private int id;
	@Column(name = "packagename")
	private String packageName;
	private String testDetails;
	private int cost;
	private int duration;
	@ManyToOne
	@JoinColumn(name = "ailment_id")
	private Ailment ailment;
	

}
