package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognizant.treatment.proxy.PatientDetailProxy;

class PatientDetailProxyTest {
	private PatientDetailProxy proxy;

	@BeforeEach
	public void setUp() {
		proxy = new PatientDetailProxy(1, "name", 20, "ailment", "treatmentpackagename", "2020-01-02");
		PatientDetailProxy proxy1 = new PatientDetailProxy();
	}

	@Test
	public void testAllGetterSetterConstructor() {
		PatientDetailProxy p1 = new PatientDetailProxy();
		PatientDetailProxy p2 = new PatientDetailProxy();
		p1.setAge(23);
		p1.setAilment("ailment");
		p1.setId(1);
		p1.setName("name");
		p1.setTreatmentcommencementdate("treatmentcommencementdate");
		p1.setTreatmentpackagename("treatmentpackagename");
		p2.setAge(23);
		p2.setAilment("ailment");
		p2.setId(1);
		p2.setName("name");
		p2.setTreatmentcommencementdate("treatmentcommencementdate");
		p2.setTreatmentpackagename("treatmentpackagename");
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		assertEquals(p1.toString(), p2.toString());
		assertEquals(1, proxy.getId());
		assertEquals("name", proxy.getName());
		assertEquals(20, proxy.getAge());
		assertEquals("ailment", proxy.getAilment());
		assertEquals("treatmentpackagename", proxy.getTreatmentpackagename());
		assertEquals("2020-01-02", proxy.getTreatmentcommencementdate());
	}

}
