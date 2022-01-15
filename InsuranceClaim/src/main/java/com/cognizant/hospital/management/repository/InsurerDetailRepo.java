package com.cognizant.hospital.management.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.hospital.management.model.InsurerDetail;
//insurer detail repo class
public interface InsurerDetailRepo extends CrudRepository<InsurerDetail, String>{

	public List<InsurerDetail> findByInsurerPackageName(String pname);
	public List<InsurerDetail> findByInsurerName(String iName);

}
