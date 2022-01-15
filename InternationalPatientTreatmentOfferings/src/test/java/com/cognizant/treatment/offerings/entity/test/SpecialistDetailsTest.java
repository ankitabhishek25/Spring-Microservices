package com.cognizant.treatment.offerings.entity.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.Entity.PackageDetails;
import com.cognizant.treatment.offerings.Entity.SpecialistDetails;

@ExtendWith(MockitoExtension.class)
class SpecialistDetailsTest {

	private SpecialistDetails sd;

	@BeforeEach
	public void setUp() {
		sd = new SpecialistDetails();
		Ailment ailment = new Ailment();
		ailment.setId(1);
		ailment.setName("name");
		List<PackageDetails> packagedetails = new ArrayList<>();
		ailment.setPackagedetails(packagedetails);
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		ailment.setSpecialistdetails(specialistdetails);
		sd.setAilment(ailment);
		sd.setAreaofExperties("AreaofExperties");
		sd.setContactNo("contactNo");
		sd.setExperiences(5);
		sd.setId(1);
		sd.setName("Name");
		sd = new SpecialistDetails(1, "Name", "AreaofExperties", "contactNo", 5, ailment);
	}

	@Test
	public void testAllGetterSetterConstructor() {
		assertEquals(1, sd.getId());
		assertEquals("Name", sd.getName());
		assertEquals(5, sd.getExperiences());
		assertEquals("contactNo", sd.getContactNo());
		assertEquals("AreaofExperties", sd.getAreaofExperties());
		Ailment ailment2 = new Ailment();
		ailment2.setId(1);
		ailment2.setName("name");
		List<PackageDetails> packagedetails = new ArrayList<>();
		ailment2.setPackagedetails(packagedetails);
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		ailment2.setSpecialistdetails(specialistdetails);
		// assertEquals(ailment2, sd.getAilment());
		SpecialistDetails s = new SpecialistDetails();
		s.setAilment(ailment2);
		s.setAreaofExperties("AreaofExperties");
		s.setContactNo("contactNo");
		s.setExperiences(5);
		s.setId(1);
		s.setName("Name");
		SpecialistDetails s1 = new SpecialistDetails();
		s1.setAilment(ailment2);
		s1.setAreaofExperties("AreaofExperties");
		s1.setContactNo("contactNo");
		s1.setExperiences(5);
		s1.setId(1);
		s1.setName("Name");
		assertEquals(s, s1);
		assertEquals(s.hashCode(), s1.hashCode());
		assertEquals(s.toString(), s1.toString());
		assertEquals(1, sd.getId());
		assertEquals("Name", sd.getName());
		assertEquals("AreaofExperties", sd.getAreaofExperties());
		assertEquals("contactNo", sd.getContactNo());
		assertEquals(5, sd.getExperiences());
		//assertEquals(ailment2, sd.getAilment());
	}

}
