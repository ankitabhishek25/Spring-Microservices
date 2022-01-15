package com.cognizant.treatment.offerings.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "ailment")
@Entity
public class Ailment {

	public Ailment() {
		super();
	}
	public Ailment(int id, String name, List<PackageDetails> packagedetails,
			List<SpecialistDetails> specialistdetails) {
		super();
		this.id = id;
		this.name = name;
		this.packagedetails = packagedetails;
		this.specialistdetails = specialistdetails;
	}
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
	public List<PackageDetails> getPackagedetails() {
		return packagedetails;
	}
	public void setPackagedetails(List<PackageDetails> packagedetails) {
		this.packagedetails = packagedetails;
	}
	public List<SpecialistDetails> getSpecialistdetails() {
		return specialistdetails;
	}
	public void setSpecialistdetails(List<SpecialistDetails> specialistdetails) {
		this.specialistdetails = specialistdetails;
	}
	
	
	@Override
	public String toString() {
		return "Ailment [id=" + id + ", name=" + name + "]";
	}


	@Id
	private int id;
	private String name;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "ailment", cascade = CascadeType.ALL)
	private List<PackageDetails> packagedetails = new ArrayList<PackageDetails>();
	@OneToMany(mappedBy = "ailment", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<SpecialistDetails> specialistdetails = new ArrayList<SpecialistDetails>();

}
