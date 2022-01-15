package com.cognizant.hospital.management.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hospital.management.model.InsurerDetail;
import com.cognizant.hospital.management.repository.InsurerDetailRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class InsurerDetailService {
	@Autowired
	private InsurerDetailRepo insurerDetailRepo;

	public InsurerDetailService(InsurerDetailRepo insurerDetailRepo) {
		super();
		this.insurerDetailRepo = insurerDetailRepo;
	}

	public List<InsurerDetail> getAllInsurerDetails(){
		
		//log.info("getAllInsurerDetails()--->go through");
		//log.info("getAllInsurerDetails() starts");
		List<InsurerDetail> insurerDetails = new ArrayList<>();
		insurerDetailRepo.findAll()
		.forEach(insurerDetails::add);
		return insurerDetails;
	
	}
	
	public List<InsurerDetail> getInsurerByPackage(String name)
	{
		 // log.info("getInsurerByPackage()--->go through");
		return  insurerDetailRepo.findByInsurerPackageName(name);
	}
	
	public List<InsurerDetail> getInsurerByInsurerName(String name)
	{
		return insurerDetailRepo.findByInsurerName(name);
	}
	
	
}
