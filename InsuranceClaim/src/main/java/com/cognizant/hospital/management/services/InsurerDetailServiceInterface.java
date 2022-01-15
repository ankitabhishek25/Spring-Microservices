package com.cognizant.hospital.management.services;

import java.util.List;

import com.cognizant.hospital.management.model.InsurerDetail;

public interface InsurerDetailServiceInterface {

	public List<InsurerDetail> getAllInsurerDetails();
	public List<InsurerDetail> getInsurerByPackage(String name);
	public List<InsurerDetail> getInsurerByInsurerName(String name);
}
