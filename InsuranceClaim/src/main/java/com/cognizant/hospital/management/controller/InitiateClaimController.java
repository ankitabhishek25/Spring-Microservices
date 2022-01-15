 package com.cognizant.hospital.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.hospital.management.client.AuthClient;
import com.cognizant.hospital.management.exception.ApiRequestException;
import com.cognizant.hospital.management.model.AuthResponse;
import com.cognizant.hospital.management.model.InitiateClaim;
import com.cognizant.hospital.management.model.InsurerDetail;
import com.cognizant.hospital.management.services.InitiateClaimServiceInterface;
import com.cognizant.hospital.management.services.InsurerDetailService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InitiateClaimController {

	
	@Autowired
	private InsurerDetailService insurerDetailService;
	
	@Autowired
	AuthClient auth;
	
	@PostMapping("/insurance/InitiateClaim")
	public double getClaim(@RequestHeader(name="Authorization") String token,@RequestBody InitiateClaim iName)
	{
		AuthResponse response=auth.verifyToken(token);
		if(response.isValid()) {
		//	log.info("Initiate Claim()--->go through");
		//	log.info("Initiate Claim() starts");
			
	
 		//InsurerDetail id =	insurerDetailService.getInsurerByInsurerName(initiateClaimService.getByName(iName.getInsurerName()).getInsurerName());
 		
 		List<InsurerDetail> id = insurerDetailService.getInsurerByInsurerName(iName.getInsurerName());
 		if(id==null)
 			return 0.0;
 		else
 			return id.get(0).getInsuranceAmountLimit();
	}
		else {
			//log.info("Initiate Claim() could not work...");
			throw new ApiRequestException("You are not LoggedIn"); 
		}
	}
	
	@GetMapping("/insurance/GetAllInsurerDetail")
	public ResponseEntity<List<InsurerDetail>> getAll(@RequestHeader(name="Authorization") String token )throws Exception
	{
		AuthResponse response=auth.verifyToken(token);
		if(response.isValid()) {
			//log.info("GetAllinsurerDetails()--->go through");
			//log.info("getAllInsurerDetails() starts");
		List<InsurerDetail> id= insurerDetailService.getAllInsurerDetails();
		return new ResponseEntity<List<InsurerDetail>>(id, HttpStatus.OK);
		}
		else {
			log.info("getAllInsurerDetails() could not work");
			throw new ApiRequestException("You are not LoggedIn"); 
		}
		
	}
	
	@GetMapping("/insurance/GetInsurerByPackageName/{Pkgname}")
	public ResponseEntity<List<InsurerDetail>> getPackage(@RequestHeader(name="Authorization") String token,@PathVariable("Pkgname") String pkgname)throws Exception
	{
		AuthResponse response = auth.verifyToken(token);
		if(response.isValid()) {
			//log.info("GetInsurerPackage()--->go through");
			//log.info("GetInsurerPackage()--->starts");
		List<InsurerDetail> id =insurerDetailService.getInsurerByPackage(pkgname);
		return new ResponseEntity<List<InsurerDetail>>(id,HttpStatus.OK);
	}else
	{
		//log.info("GetInsurerPackage()--->Could not work");
		throw new ApiRequestException("You are not logged in...");
	}
}
}