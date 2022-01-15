package com.cognizant.hospital.management.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.hospital.management.model.AuthResponse;
//Auth client
@FeignClient(url="http://localhost:8083/auth",name="AUTH")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse verifyToken(@RequestHeader(name="Authorization",required=true)String token);
	
}
