package com.rfqui.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rfqui.model.PatientDetail;
import com.rfqui.model.PatientDetailProxy;
import com.rfqui.model.TreatmentPlanProxy;

@FeignClient(url="http://localhost:8082/treatment",name="client1")
public interface IptClient {
//	@PostMapping("/FormulateTreatmentTimetable")
	//public ResponseEntity<?> createUser(@RequestHeader(name="Authorization") String token ,@RequestBody PatientDetail details);
	
	@PostMapping("/FormulateTreatmentTimetable/{token}")
	public TreatmentPlanProxy createUser1(@PathVariable("token")String token,@RequestBody PatientDetail details);
	
	
	@GetMapping("/getAllPatient")
	public List<PatientDetailProxy> getAllPatient(@RequestHeader(name="Authorization") String token );
}
