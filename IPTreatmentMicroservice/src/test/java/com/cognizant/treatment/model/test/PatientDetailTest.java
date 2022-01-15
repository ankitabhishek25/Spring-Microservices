package com.cognizant.treatment.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.model.PatientDetail;

@ExtendWith(MockitoExtension.class)
class PatientDetailTest {

	private PatientDetail patientdetail;

	@BeforeEach
	public void setUp() {
		patientdetail = new PatientDetail(1, "name", 20, "ailment", "treatmentpackagename", "treatmentcommencementdate",
				null);
	}

	@Test
	public void testAllGetterSetterConstructor() {
		assertEquals("name", patientdetail.getName());
		assertEquals(20, patientdetail.getAge());
		assertEquals("ailment", patientdetail.getAilment());
		assertEquals("treatmentpackagename", patientdetail.getTreatmentpackagename());
		assertEquals("treatmentcommencementdate", patientdetail.getTreatmentcommencementdate());
		assertEquals(null, patientdetail.getTreatmentplan());
	}

}
