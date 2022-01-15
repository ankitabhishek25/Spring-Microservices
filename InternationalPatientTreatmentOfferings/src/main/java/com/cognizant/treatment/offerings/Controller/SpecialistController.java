package com.cognizant.treatment.offerings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.treatment.offerings.Service.SpecialistService;
import com.cognizant.treatment.offerings.client.AuthClient;
import com.cognizant.treatment.offerings.model.SpecialistDetailsModel;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SpecialistController {

	
	@Autowired
	SpecialistService service;
	@Autowired
	AuthClient auth;
	
	
	@GetMapping("/treatmentoffer/Specialists")
	public List<SpecialistDetailsModel> getAllSpecialist() {
	
		log.info("getAllSpecialist()--->go through");
	
		return service.getAllSpecialist();
	}
	
	
	
	}

	
	

