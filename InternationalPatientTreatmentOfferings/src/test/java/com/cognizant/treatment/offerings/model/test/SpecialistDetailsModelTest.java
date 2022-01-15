package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.model.SpecialistDetailsModel;

@ExtendWith(MockitoExtension.class)
class SpecialistDetailsModelTest {

	private SpecialistDetailsModel model;

	@BeforeEach
	public void setUp() {
		model = new SpecialistDetailsModel();
		model = new SpecialistDetailsModel(1, "Name", "AreaofExperties", "contactNo", 5);
		model.setAreaofExperties("areaofExperties");
		model.setContactNo("contactNo");
		model.setExperiences(5);
		model.setId(5);
		model.setName("Name");
		
	}

	@Test
	public void testAllGetterSetterConstructor() {
		SpecialistDetailsModel s = new SpecialistDetailsModel();
		SpecialistDetailsModel s1 = new SpecialistDetailsModel();
		s.setAreaofExperties("areaofExperties");
		s.setContactNo("contactNo");
		s.setExperiences(5);
		s.setId(5);
		s.setName("Name");
		s1.setAreaofExperties("areaofExperties");
		s1.setContactNo("contactNo");
		s1.setExperiences(5);
		s1.setId(5);
		s1.setName("Name");
		assertEquals("areaofExperties", model.getAreaofExperties());
		assertEquals("contactNo", model.getContactNo());
		assertEquals(5, model.getId());
		assertEquals(5, model.getId());
		assertEquals("Name", model.getName());

		assertEquals("areaofExperties", model.getAreaofExperties());
		assertEquals("contactNo", model.getContactNo());
		assertEquals(5, model.getId());
		assertEquals(5, model.getId());
		assertEquals("Name", model.getName());
		assertEquals(s.toString(), s1.toString());
	}

}
