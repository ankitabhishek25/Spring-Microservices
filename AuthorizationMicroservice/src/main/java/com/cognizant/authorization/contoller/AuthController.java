package com.cognizant.authorization.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.authorization.dao.UsersInternationalPatientTreatment;
import com.cognizant.authorization.model.AuthResponse;
import com.cognizant.authorization.model.UserLoginCredential;
import com.cognizant.authorization.model.UserToken;
import com.cognizant.authorization.service.CustomerDetailsService;
import com.cognizant.authorization.service.JwtUtil;



@RestController
public class AuthController {

	@Autowired
	private AuthenticationManager authmanager;
	@Autowired
	private JwtUtil jwtutil;
	@Autowired
	private CustomerDetailsService custdetailservice;
	//@Autowired
	//private userDAO userservice;
	
	@Autowired
	private UsersInternationalPatientTreatment users;
	
	@RequestMapping(value="/auth/login",method=RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody UserLoginCredential userlogincredentials)
	{
		
		try
		{
		authmanager.authenticate(new UsernamePasswordAuthenticationToken(userlogincredentials.getUid(), userlogincredentials.getPassword()));
		
		}
		catch(Exception e)
		{
			//System.out.println(e);
			return new ResponseEntity<>("Invalid UserId/Password",HttpStatus.UNAUTHORIZED);
		}
		final UserDetails userdetails = custdetailservice.loadUserByUsername(userlogincredentials.getUid()+""); 
		
	
		return new ResponseEntity<>(new UserToken(userlogincredentials.getUid(),jwtutil.generateToken(userdetails)),HttpStatus.OK);
	
		
	}
	@RequestMapping(value="/auth/validate",method=RequestMethod.GET)
	public ResponseEntity<?> getValidity(@RequestHeader("Authorization") String token)
	{
		token=token.substring(7);
		AuthResponse res=new AuthResponse();
		if(jwtutil.validateToken(token))
		{
			res.setUid(jwtutil.extractUsername(token));
			res.setValid(true);
			res.setName(users.findById(res.getUid()).getUname());
		}
		else
			res.setValid(false);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
}
