package com.cognizant.treatment.offerings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.treatment.offerings.Repository.AilmentRepository;

@SpringBootTest
class InternationalPatientTreatmentOfferingsApplicationTests {

	@Autowired
	AilmentRepository repository;
	@Test
	void contextLoads() {
	}
	
	

	
	
	/*public void testCreateAilment() {
		Ailment ailment = new Ailment();
		ailment.setName("Urology");
		HashSet<Package> packages = new HashSet<Package>();
		Package package1 = new Package();
		package1.setPackageName("package1");
		package1.setTestDetails("UTP1,UTP2");
		package1.setCost(2500);
		package1.setDuration(4);
		package1.setAilment(ailment);
		packages.add(package1);
		
		
		Package package2 = new Package();
		package2.setPackageName("package2");
		package2.setTestDetails("UTP3,UTP4");
		package2.setCost(3000);
		package2.setDuration(6);
		package2.setAilment(ailment);
		packages.add(package2);
		
		ailment.setPackages(packages);
		repository.save(ailment);
	}*/

	
	
}
