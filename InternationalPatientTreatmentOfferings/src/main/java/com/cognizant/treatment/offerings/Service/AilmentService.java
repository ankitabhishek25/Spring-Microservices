package com.cognizant.treatment.offerings.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.Repository.AilmentRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AilmentService {
	
	@Autowired
	AilmentRepository repository;
	
	
	 public List<Ailment> getAllAilment(){
         List<Ailment> ailments=new ArrayList<>();
         log.info("getAllAilment()--->go through");
         log.info("getAllAilment()  starts");
         repository.findAll()
                 .forEach(ailments::add);
         log.info("getAllAilment()  ends");
         return ailments;
 }

 /*public Ailment addAilment(Ailment ailments){

     Ailment ailment=repository.save(ailments);
     return  ailment;
 }*/
 
 /*public void save() {
	 Ailment ailment=new Ailment();
	 //ailment.setId(1);
	 ailment.setName("NEUROLOGY");
	 PackageDetails pckg=new PackageDetails();
	 //pckg.setId(1);
	 pckg.setPackageName("package1");
	 
	 PackageDetails pck=new PackageDetails();
	// pck.setId(2);
	 pck.setPackageName("package2");
	 
	 //ailment.getPackagedetails().add(pckg);
	// ailment.getPackagedetails().add(pck);
	 
	 System.out.println(repository);
	 
	 repository.save(ailment);
 }*/
 
}
