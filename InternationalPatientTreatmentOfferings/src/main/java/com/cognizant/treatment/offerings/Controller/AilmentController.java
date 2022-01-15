package com.cognizant.treatment.offerings.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.Entity.PackageDetails;
import com.cognizant.treatment.offerings.Entity.SpecialistDetails;
import com.cognizant.treatment.offerings.Repository.AilmentRepository;
import com.cognizant.treatment.offerings.Service.AilmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AilmentController {
	
	@Autowired
	AilmentService ailmentService;
	@Autowired
	AilmentRepository repo;
	
	
	/*@PostMapping("/addAilments")
	public void addAilments(@RequestBody Ailment ailment) {
		ailmentService.addAilment(ailment);
	}*/
	
	@PostMapping("/treatmentoffer/addAilments")
	public void saveAilments() {
		log.info("saveAilment()--->go through");
		log.info("saveAilment()  starts");
		PackageDetails packageDetails=new PackageDetails();
		//PCK.setId(1);
		packageDetails.setPackageName("Package1");
		packageDetails.setTestDetails("EUR1");
		packageDetails.setCost(2500);
		packageDetails.setDuration(5);
		PackageDetails packageDetails2=new PackageDetails();
		//PCK.setId(1);
		packageDetails2.setPackageName("Package2");
		packageDetails2.setTestDetails("EUR2");
		packageDetails2.setCost(3500);
		packageDetails2.setDuration(7);
		
		SpecialistDetails sdl=new SpecialistDetails();
		sdl.setName("Dr SOUMENDRA PANDA");
		sdl.setAreaofExperties("Eurology");
		sdl.setContactNo("7978613070");
		sdl.setExperiences(2);
		
		SpecialistDetails sdl1=new SpecialistDetails();
		sdl1.setName("Dr Ankit Abhishek");
		sdl1.setAreaofExperties("Eurology");
		sdl1.setContactNo("9438150536");
		sdl1.setExperiences(5);
		
		List<PackageDetails> packagede=new ArrayList<PackageDetails>();
		packagede.add(packageDetails);
		//Package1.add(PCK1);
		
		List<SpecialistDetails> specialist1=new ArrayList<SpecialistDetails>();
		specialist1.add(sdl);
	//	Specialist1.add(sdl1);		
		
		
		Ailment ail=new Ailment();
		ail.setName("EUROLOGY");
		ail.setPackagedetails(packagede);
		ail.setSpecialistdetails(specialist1);
		
		packageDetails.setAilment(ail);
		packageDetails2.setAilment(ail);
		
		sdl.setAilment(ail);
		sdl1.setAilment(ail);		
		repo.save(ail);
		log.debug("Ailment info :{}", ail);
		log.info("saveAilments() ----->ends");
		
	}
	
	@GetMapping("/treatmentoffer/showAilments")
	public List<Ailment> getAllAilment(){
		log.info("getAllAilment()--->go through");
		return ailmentService.getAllAilment();
	}

	
}
