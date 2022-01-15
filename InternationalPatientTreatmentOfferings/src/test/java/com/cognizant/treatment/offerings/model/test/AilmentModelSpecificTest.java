package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.model.AilmentModelSpecific;

@ExtendWith(MockitoExtension.class)

class AilmentModelSpecificTest {

	private AilmentModelSpecific model;

	@BeforeEach
	public void setUp() {

		model = new AilmentModelSpecific();
		model.setName("name");
	}

	@Test
	public void testAllGetterSetterConstructor() {
		assertEquals("name", model.getName());
	}

}
