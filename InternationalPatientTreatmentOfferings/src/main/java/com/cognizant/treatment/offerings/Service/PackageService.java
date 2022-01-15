package com.cognizant.treatment.offerings.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.treatment.offerings.Entity.PackageDetails;
import com.cognizant.treatment.offerings.Entity.SpecialistDetails;
import com.cognizant.treatment.offerings.Repository.PackgeRepository;
import com.cognizant.treatment.offerings.client.AuthClient;
import com.cognizant.treatment.offerings.exception.ApiRequestException;
import com.cognizant.treatment.offerings.model.AilmentModel;
import com.cognizant.treatment.offerings.model.AuthResponse;
import com.cognizant.treatment.offerings.model.Packageee;
import com.cognizant.treatment.offerings.model.SpecialistDetailsModel;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class PackageService {
	@Autowired
	PackgeRepository repository;
	
	@Autowired
	AuthClient auth;
	
	public List<Packageee> getAllPackageDetails(String token){
		
		AuthResponse response=auth.verifyToken(token);
		log.info("getAllPackageDetails()--->go through");
		log.info("getAllPackageDetails() starts");
		if(response.isValid()) {
        List<PackageDetails> packagedetails=new ArrayList<>();
        repository.findAll()
                .forEach(packagedetails::add);
       // return packagedetails;
        List<Packageee> packlist=new ArrayList<>();
        for(PackageDetails p:packagedetails) {
        	Packageee pck=new Packageee();
        	pck.setCost(p.getCost());
        	pck.setDuration(p.getDuration());
        	pck.setTestDetails(p.getTestDetails());
        	pck.setId(p.getId());
        	pck.setPackageName(p.getPackageName());
        	
        	AilmentModel ail=new AilmentModel();
        	ail.setId(p.getAilment().getId());
        	ail.setName(p.getAilment().getName());
        	
      List<SpecialistDetailsModel> doclist=new ArrayList<>();
       for(SpecialistDetails sd:p.getAilment().getSpecialistdetails()) {
    	   SpecialistDetailsModel sdm=new SpecialistDetailsModel();
    	   sdm.setId(sd.getId());
    	   sdm.setContactNo(sd.getContactNo());
    	   sdm.setName(sd.getName());
    	   sdm.setExperiences(sd.getExperiences());
    	  doclist.add(sdm);
    	  
       }
       
      ail.setDoctors(doclist);
        	
        	pck.setAilment(ail);
        
        
        
        	packlist.add(pck);
        	
        	
        }
        log.info("getAllPackageDetails() ends");
        return packlist;
		}
		else {
			log.info("getAllPackageDetails() could not work");
			throw new ApiRequestException("You are not LoggedIn"); 
		}
        
        
        
        
        
        
}
	
	
	
	public List<Packageee> getPackageDetails(String packName){
		 log.info("getPackageDetails()---go through");
			log.info("getPackageDetails()---starts");
		List<PackageDetails> packagedetails=new ArrayList<>();
       
        repository.findByPackageName(packName)
                .forEach(packagedetails::add);
       // return packagedetails;
        List<Packageee> packlist=new ArrayList<>();
        for(PackageDetails p:packagedetails) {
        	Packageee pck=new Packageee();
        	pck.setCost(p.getCost());
        	pck.setDuration(p.getDuration());
        	pck.setTestDetails(p.getTestDetails());
        	pck.setId(p.getId());
        	pck.setPackageName(p.getPackageName());
        	
        	log.debug("PackageDetails", pck);
        	
        	AilmentModel ail=new AilmentModel();
        	ail.setId(p.getAilment().getId());
        	ail.setName(p.getAilment().getName());
            
       List<SpecialistDetailsModel> doclist=new ArrayList<>();
       for(SpecialistDetails sd:p.getAilment().getSpecialistdetails()) {
    	   SpecialistDetailsModel sdm=new SpecialistDetailsModel();
    	   sdm.setId(sd.getId());
    	   sdm.setContactNo(sd.getContactNo());
    	   sdm.setName(sd.getName());
    	   sdm.setExperiences(sd.getExperiences());
    	  doclist.add(sdm);
    	  
       }
       
       ail.setDoctors(doclist);
        	
        	pck.setAilment(ail);
        
        
        
        	packlist.add(pck);
        	
        	
        }
        log.info("getPackageDetails() ends");
        return packlist;
	}
	
	public Packageee getPackageDetailsandid(String name,String packName){
		 log.info("getPackageDetailsandid()---go through");
			log.info("getPackageDetailsandid()---starts");
		PackageDetails p=
        repository.findByPackageNameandAilment(name,packName);
            //    System.out.println(p);
       // return packagedetails;
		/*
		 * List<Packageee> packlist=new ArrayList<>(); for(PackageDetails
		 * p:packagedetails)
		 */
        
        	Packageee pck=new Packageee();
        	pck.setCost(p.getCost());
        	pck.setDuration(p.getDuration());
        	pck.setTestDetails(p.getTestDetails());
        	pck.setId(p.getId());
        	pck.setPackageName(p.getPackageName());
        	log.debug("PackageDetails", pck);
        	
        	AilmentModel ail=new AilmentModel();
        	ail.setId(p.getAilment().getId());
        	ail.setName(p.getAilment().getName());
            
       List<SpecialistDetailsModel> doclist=new ArrayList<>();
       for(SpecialistDetails sd:p.getAilment().getSpecialistdetails()) {
    	   SpecialistDetailsModel sdm=new SpecialistDetailsModel();
    	   sdm.setId(sd.getId());
    	   sdm.setContactNo(sd.getContactNo());
    	   sdm.setName(sd.getName());
    	   sdm.setExperiences(sd.getExperiences());
    	  doclist.add(sdm);
    	  
       }
       
       ail.setDoctors(doclist);
        	
        	pck.setAilment(ail);
        
        
        
        	
        	
        	 log.info("getPackageDetailsandid()---ends");
        return pck;
	}

}


