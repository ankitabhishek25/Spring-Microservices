package com.cognizant.treatment.offerings.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.treatment.offerings.model.AuthResponse;

@FeignClient(url="http://localhost:8083/auth",name="AUTH")
//@FeignClient(url="pod2-lb-1965187871.us-west-2.elb.amazonaws.com/auth",name="AUTH")
public interface AuthClient {

	
	
	@GetMapping("/validate")
	public AuthResponse verifyToken(@RequestHeader(name="Authorization",required=true)String token);
}
