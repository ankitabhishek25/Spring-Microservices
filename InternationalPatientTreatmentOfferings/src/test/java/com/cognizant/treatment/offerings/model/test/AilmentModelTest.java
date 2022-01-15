package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.model.AilmentModel;
import com.cognizant.treatment.offerings.model.SpecialistDetailsModel;

@ExtendWith(MockitoExtension.class)
class AilmentModelTest {

	private AilmentModel model;

	@BeforeEach
	public void setUp() {

		model = new AilmentModel();
		model.setId(1);
		model.setName("name");
		List<SpecialistDetailsModel> doctors = new ArrayList<>();
		model.setDoctors(doctors);
		model = new AilmentModel(1, "name", doctors);

	}

	@Test
	public void testAllGetterSetterConstructor() {
		assertEquals(1, model.getId());
		assertEquals("name", model.getName());
		List<SpecialistDetailsModel> doctors1 = new ArrayList<>();
		assertEquals(doctors1, model.getDoctors());
		assertEquals(1, model.getId());
		assertEquals("name", model.getName());
		assertEquals(doctors1, model.getDoctors());

	}

}
