package com.cognizant.authorization.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.authorization.dao.UsersInternationalPatientTreatment;
import com.cognizant.authorization.model.UserInternationalPatientTreatment;

@Service
public class CustomerDetailsService implements UserDetailsService {

	//@Autowired
	//private userDAO userdao;
	
	@Autowired
	private UsersInternationalPatientTreatment user;
	@Override
	public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		//UserInternationalPatientTreatment custuser=userdao.findById(uid).orElse(null);
		//System.out.println(custuser+"\n\n\n\n");
		UserInternationalPatientTreatment custuser = user.findById(uid);
		return new User(custuser.getUserid(), custuser.getUpassword(), new ArrayList<>());
		
		
	}

}
