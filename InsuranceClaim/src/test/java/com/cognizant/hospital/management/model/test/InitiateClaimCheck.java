package com.cognizant.hospital.management.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.hospital.management.model.InitiateClaim;

@ExtendWith(MockitoExtension.class)
class InitiateClaimCheck {

	private InitiateClaim initiateClaim;
	private InitiateClaim initiateClaim2;
	private InitiateClaim ic;
	@BeforeEach
	public void setUp() {
		initiateClaim= new InitiateClaim("Aman", "Ortho", "P1", "Apollo");
		initiateClaim2= new InitiateClaim("Aman", "Ortho", "P1", "Apollo");
		ic=new InitiateClaim();
		ic.setAilment("fever");
		ic.setInsurerName("LIC");
		ic.setPatientName("Arjun");
		ic.setTreatmentPackageName("P2");
	}
	
	@Test
	public void testAllGetterSetterConstructors() {
		assertEquals("Aman", initiateClaim.getPatientName());
		assertEquals("Ortho", initiateClaim.getAilment());
		assertEquals("P1", initiateClaim.getTreatmentPackageName());
		assertEquals("Apollo", initiateClaim.getInsurerName());
		assertEquals("Arjun",ic.getPatientName());
		assertEquals("fever",ic.getAilment());
		assertEquals("P2",ic.getTreatmentPackageName());
		assertEquals("LIC",ic.getInsurerName());
		assertEquals(ic, ic);
		assertEquals(ic.hashCode(), ic.hashCode());
		assertEquals(ic.toString(), ic.toString());
		assertTrue(ic.equals(ic));
		assertTrue(initiateClaim.equals(initiateClaim));
		assertEquals(initiateClaim, initiateClaim2);
		assertEquals(initiateClaim.hashCode(), initiateClaim2.hashCode());
		
	}
}
