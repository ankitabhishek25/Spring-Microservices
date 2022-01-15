package com.cognizant.treatment.offerings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.treatment.offerings.Repository.PackgeRepository;
import com.cognizant.treatment.offerings.Service.PackageService;
import com.cognizant.treatment.offerings.client.AuthClient;
import com.cognizant.treatment.offerings.exception.ApiRequestException;
import com.cognizant.treatment.offerings.model.AuthResponse;
import com.cognizant.treatment.offerings.model.Packageee;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PackageController {

	@Autowired
	PackageService packageService;
	@Autowired
	PackgeRepository repository;

	@Autowired
	AuthClient auth;

	@GetMapping("/treatmentoffer/IPTreatmentPackages")
	public List<Packageee> getAllPackages(@RequestHeader(name = "Authorization") String token) throws Exception {
		log.info("getAllPackageDetails()--->go through");
		return packageService.getAllPackageDetails(token);
	}

	@GetMapping("/treatmentoffer/{packageName}")
	public List<Packageee> findByName(@RequestHeader(name = "Authorization") String token,
			@PathVariable String packageName) throws Exception {
		AuthResponse response = auth.verifyToken(token);
		log.info("findByName()--->go through");
		log.info("findByName() starts");
		if (response.isValid()) {
			log.info("findByName() ends");
			return packageService.getPackageDetails(packageName);
		} else {
			log.info("findByName() could not work");
			throw new ApiRequestException("You are not LoggedIn");
		}

	}

	@GetMapping("/treatmentoffer/{name}/{packageName}")
	public Packageee findByNameandid(@RequestHeader(name = "Authorization") String token, @PathVariable String name,
			@PathVariable String packageName) throws ApiRequestException {
		AuthResponse response = auth.verifyToken(token);
		log.info("findByNameandid()--->go through");
		log.info("findByNameandid() starts");
		if (response.isValid()) {
			log.info("findByNameandid() ends");
			return packageService.getPackageDetailsandid(name, packageName);
		} else {
			log.info("findByNameandid() could not work");
			throw new ApiRequestException("You are not LoggedIn");
		}
	}
}
