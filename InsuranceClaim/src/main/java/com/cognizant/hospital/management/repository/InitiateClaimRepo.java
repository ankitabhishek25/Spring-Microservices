package com.cognizant.hospital.management.repository;
 
  
import org.springframework.data.repository.CrudRepository;

import com.cognizant.hospital.management.model.InitiateClaim;
//initiate class repo
public interface InitiateClaimRepo extends CrudRepository<InitiateClaim,String> {
 
	  public InitiateClaim findByInsurerName(String insurerName);
	  
}
 