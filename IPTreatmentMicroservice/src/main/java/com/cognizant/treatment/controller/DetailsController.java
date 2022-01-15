package com.cognizant.treatment.controller;

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

import com.cognizant.treatment.client.AuthClient;
import com.cognizant.treatment.model.PatientDetail;
import com.cognizant.treatment.proxy.AuthResponse;
import com.cognizant.treatment.proxy.PatientDetailProxy;
import com.cognizant.treatment.service.DetailService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DetailsController {

	@Autowired
	DetailService service;
	@Autowired
	AuthClient auth;

	/*
	 * @PostMapping(produces = { MediaType.APPLICATION_XML_VALUE,
	 * MediaType.APPLICATION_JSON_VALUE }, consumes = {
	 * MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	 */
	
	@GetMapping("/treatment/getAllPatient")
	public List<PatientDetailProxy> getAllPatient(@RequestHeader(name="Authorization") String token) throws Exception
	{
		AuthResponse response=auth.verifyToken(token);
		if((response).isValid()) {
		return service.getAllPatientDetails(token);
		}
		else {
			throw new Exception("You are not LoggedIn"); 
		}
	}
	
	
	@PostMapping("/treatment/FormulateTreatmentTimetable")
	//public TreatmentPlanProxy createUser(@RequestHeader(name="Authorization") String token ,@RequestBody PatientDetail details)
	public ResponseEntity<?> createUser(@RequestHeader(name="Authorization") String token ,@RequestBody PatientDetail details)
	{

	    log.info("createUser()-->go through");
			log.info("createUser() starts");
		AuthResponse response=auth.verifyToken(token);
		if(response.isValid()) {
			  log.info("createUser() logged in and ends");
			return new ResponseEntity<>(service.saveOrder(token,details),HttpStatus.OK);
		}else
		{
			 log.info("createUser() could not log in");
			return new ResponseEntity<>("You are not LoggedIn",HttpStatus.FORBIDDEN);
		}
		

	}


	
	@PostMapping("/treatment/FormulateTreatmentTimetable/{token}")
	//public TreatmentPlanProxy createUser(@RequestHeader(name="Authorization") String token ,@RequestBody PatientDetail details)
	public ResponseEntity<?> createUser1(@PathVariable("token")String token,@RequestBody PatientDetail details)
	{
		
			return new ResponseEntity<>(service.saveOrder(token,details),HttpStatus.OK);
		
		

	}
	
	//@GetMapping("/treatment/TreatmentTable")
	//public List<TreatmentPlanProxy> getTreatmentTimeTable(){
	//	return service.showTreatmentTimeTable();
	//}//
	

}
