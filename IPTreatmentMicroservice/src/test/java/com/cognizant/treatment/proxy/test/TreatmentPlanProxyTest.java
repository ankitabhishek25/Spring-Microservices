package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.proxy.TreatmentPlanProxy;

@ExtendWith(MockitoExtension.class)
class TreatmentPlanProxyTest {

	private TreatmentPlanProxy proxy;

	@BeforeEach
	public void setUp() {
		proxy = new TreatmentPlanProxy();
		proxy.setId(1);
		proxy.setCost(2300);
		proxy.setPackagename("packagename");
		proxy.setSpecialist("specialist");
		proxy.setTestdetails("testdetails");
		proxy.setTreatmentcommencementdate("treatmentcommencementdate");
		proxy.setTreatmentEndDate("TreatmentEndDate");
		proxy = new TreatmentPlanProxy(1, "packagename", "testdetails", 2300, "specialist", "treatmentcommencementdate",
				"TreatmentEndDate");
	}

	@Test
	public void testAllGetterSetterConstructors() {
		TreatmentPlanProxy tp = new TreatmentPlanProxy();
		TreatmentPlanProxy tp2 = new TreatmentPlanProxy();
		tp.setCost(2000);
		tp.setId(1);
		tp.setPackagename("packagename");
		tp.setSpecialist("specialist");
		tp.setTestdetails("testdetails");
		tp.setTreatmentcommencementdate("treatmentcommencementdate");
		tp.setTreatmentEndDate("TreatmentEndDate");
		tp2.setCost(2000);
		tp2.setId(1);
		tp2.setPackagename("packagename");
		tp2.setSpecialist("specialist");
		tp2.setTestdetails("testdetails");
		tp2.setTreatmentcommencementdate("treatmentcommencementdate");
		tp2.setTreatmentEndDate("TreatmentEndDate");
		assertEquals(tp, tp2);
		assertEquals(tp.hashCode(), tp2.hashCode());
		assertEquals(tp.toString(), tp2.toString());
		assertEquals(1, proxy.getId());
		assertEquals("packagename", proxy.getPackagename());
		assertEquals("testdetails", proxy.getTestdetails());
		assertEquals(2300, proxy.getCost());
		assertEquals("specialist", proxy.getSpecialist());
		assertEquals("treatmentcommencementdate", proxy.getTreatmentcommencementdate());
		assertEquals("TreatmentEndDate", proxy.getTreatmentEndDate());

	}
}
