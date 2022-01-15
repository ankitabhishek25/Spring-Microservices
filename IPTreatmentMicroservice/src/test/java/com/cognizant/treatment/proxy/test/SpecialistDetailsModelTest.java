package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.proxy.SpecialistDetailsModel;

@ExtendWith(MockitoExtension.class)
class SpecialistDetailsModelTest {

	private SpecialistDetailsModel model;

	@BeforeEach
	public void setUp() {
		model = new SpecialistDetailsModel();
		model.setId(1);
		model.setName("Name");
		model.setExperiences(4);
		model.setContactNo("contactNo");
		model.setAreaofExperties("AreaofExperties");

	}

	@Test
	public void testAllGetterSetterConstructors() {
		SpecialistDetailsModel sd = new SpecialistDetailsModel();
		SpecialistDetailsModel sd1 = new SpecialistDetailsModel();
		sd.setId(1);
		sd.setAreaofExperties("AreaofExperties");
		sd.setContactNo("contactNo");
		sd.setExperiences(5);
		sd.setName("Name");
		sd1.setAreaofExperties("AreaofExperties");
		sd1.setContactNo("contactNo");
		sd1.setExperiences(5);
		sd1.setId(1);
		sd1.setName("Name");
		assertEquals(sd, sd1);
		assertEquals(sd.hashCode(), sd1.hashCode());
		assertEquals(sd.toString(),sd1.toString());
		assertEquals(1, model.getId());
		assertEquals("Name", model.getName());
		assertEquals(4, model.getExperiences());
		assertEquals("contactNo", model.getContactNo());
		assertEquals("AreaofExperties", model.getAreaofExperties());
	}
}
