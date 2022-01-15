package com.rfqui.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rfqui.model.AuthResponse;
import com.rfqui.model.UserLoginCredential;
import com.rfqui.model.UserToken;

@FeignClient(url="http://localhost:8083/auth",name="AUTH")
public interface AuthClient {
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public UserToken login(@RequestBody UserLoginCredential userlogincredentials);
	@RequestMapping(path="/validate",method=RequestMethod.GET)
	public AuthResponse verifyToken(@RequestHeader(name="Authorization",required=true)String token);


}
