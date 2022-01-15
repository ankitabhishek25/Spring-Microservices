/*package com.cognizant.treatment.offerings.service.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.Entity.PackageDetails;
import com.cognizant.treatment.offerings.Entity.SpecialistDetails;
import com.cognizant.treatment.offerings.Repository.PackgeRepository;
import com.cognizant.treatment.offerings.Service.PackageService;

@SpringBootTest
class PackageServiceTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Autowired
	private PackageService packageService;
	
	@MockBean
	private PackgeRepository packageRepository;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testgetAllPackageDetails() {
		PackageDetails PCK=new PackageDetails();
		PCK.setId(1);
		PCK.setPackageName("Package1");
		PCK.setTestDetails("EUR1");
		PCK.setCost(2500);
		PCK.setDuration(5);
		
		SpecialistDetails sdl=new SpecialistDetails();
		sdl.setName("Dr SOUMENDRA PANDA");
		sdl.setAreaofExperties("Eurology");
		sdl.setContactNo("7978613070");
		sdl.setExperiences(2);
		
		
		List<PackageDetails> Package1=new ArrayList<PackageDetails>();
		Package1.add(PCK);

		List<SpecialistDetails> Specialist1=new ArrayList<SpecialistDetails>();
		Specialist1.add(sdl);
		Ailment ail=new Ailment();
		ail.setName("EUROLOGY");
		ail.setPackagedetails(Package1);
		ail.setSpecialistdetails(Specialist1);
		
		PCK.setAilment(ail);
		
		List<PackageDetails> pp=new ArrayList<PackageDetails>();
		pp.add(PCK);
		
		
		Mockito.when(packageRepository.findAll()).thenReturn(pp);
	
		//assertThat(packageService.getAllPackageDetails()).isEqualTo(pp);
		
	}

	

}*/
