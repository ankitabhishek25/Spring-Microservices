package com.cognizant.treatment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.treatment.proxy.AuthResponse;

@FeignClient(url="http://localhost:8083/auth",name="AUTH")
public interface AuthClient {

	
	
	@GetMapping("/validate")
	public AuthResponse verifyToken(@RequestHeader(name="Authorization",required=true)String token);
}
