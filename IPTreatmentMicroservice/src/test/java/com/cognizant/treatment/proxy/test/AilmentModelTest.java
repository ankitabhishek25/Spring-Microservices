package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.proxy.AilmentModel;
import com.cognizant.treatment.proxy.SpecialistDetailsModel;

@ExtendWith(MockitoExtension.class)
class AilmentModelTest {

	private AilmentModel ailmentmodel;

	@BeforeEach
	public void setUp() {
		SpecialistDetailsModel s = new SpecialistDetailsModel(1, "Name", "AreaofExperties", "contactNo", 5);
		List<SpecialistDetailsModel> doctors = new ArrayList<>();
		ailmentmodel = new AilmentModel(1, "name", doctors);
		doctors.add(s);
	}

	@Test
	public void testAllGetterSetterConstructors() {
		AilmentModel am = new AilmentModel();
		AilmentModel am2 = new AilmentModel();
		List<SpecialistDetailsModel> doctors1 = new ArrayList<>();
		SpecialistDetailsModel e = new SpecialistDetailsModel();
		e.setAreaofExperties("AreaofExperties");
		e.setContactNo("contactNo");
		e.setExperiences(5);
		e.setId(1);
		e.setName("Name");
		doctors1.add(e);
		am.setDoctors(doctors1);
		am.setId(1);
		am.setName("name");
		am2.setDoctors(doctors1);
		am2.setId(1);
		am2.setName("name");

		SpecialistDetailsModel sm = new SpecialistDetailsModel(1, "Name", "AreaofExperties", "contactNo", 5);
		List<SpecialistDetailsModel> doctors = new ArrayList<>();
		doctors.add(sm);
		assertEquals(am, am2);
		assertEquals(am.hashCode(), am2.hashCode());
		assertEquals(am.toString(), am2.toString());
		assertEquals(1, ailmentmodel.getId());
		assertEquals("name", ailmentmodel.getName());
		assertEquals(sm.getName(), "Name");
	}

}
