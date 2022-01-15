package com.cognizant.hospital.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hospital.management.model.InitiateClaim;
import com.cognizant.hospital.management.repository.InitiateClaimRepo;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class InitiateClaimService {

	//
	@Autowired
	private InitiateClaimRepo initiateClaimRepo;
	
	public InitiateClaimService(InitiateClaimRepo repo) {
		// TODO Auto-generated constructor stub
		this.initiateClaimRepo=repo;
	}

	public InitiateClaim getByName(String name)
	{
		//  log.info("getByName()-->go through");
		return initiateClaimRepo.findByInsurerName(name);
	}
}
