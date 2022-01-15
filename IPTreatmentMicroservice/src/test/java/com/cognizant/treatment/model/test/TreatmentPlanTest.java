package com.cognizant.treatment.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.model.PatientDetail;
import com.cognizant.treatment.model.TreatmentPlan;

@ExtendWith(MockitoExtension.class)
class TreatmentPlanTest {
	private TreatmentPlan treatmentplan;

	@BeforeEach
	public void setUp() {
		treatmentplan = new TreatmentPlan(1, "packagename", "testdetails", 2000, "specialist",
				"treatmentcommencementdate", "treatmentenddate", null);
	}

	@Test
	public void testAllGetterSetterConstructors() {
		TreatmentPlan t1 = new TreatmentPlan();
		TreatmentPlan t2 = new TreatmentPlan();
		t1.setCost(2000);
		t1.setId(1);
		t1.setPackagename("packagename");
		PatientDetail patientdetail = new PatientDetail();
		patientdetail.setAge(20);
		patientdetail.setAilment("ailment");
		patientdetail.setId(1);
		patientdetail.setName("name");
		patientdetail.setTreatmentcommencementdate("treatmentcommencementdate");
		patientdetail.setTreatmentpackagename("treatmentpackagename");
		treatmentplan = new TreatmentPlan(1, "packagename", "testdetails", 2000, "specialist",
				"treatmentcommencementdate", "treatmentenddate", null);
		patientdetail.setTreatmentplan(treatmentplan);
		t1.setSpecialist("specialist");
		t1.setTestdetails("testdetails");
		t1.setTreatmentcommencementdate("treatmentcommencementdate");
		t1.setTreatmentEndDate("TreatmentEndDate");
		t1.setPatientdetail(patientdetail);
		t2.setCost(2000);
		t2.setId(1);
		t2.setPackagename("packagename");
		t2.setPatientdetail(patientdetail);
		t2.setSpecialist("specialist");
		t2.setTestdetails("testdetails");
		t2.setTreatmentcommencementdate("treatmentcommencementdate");
		t2.setTreatmentEndDate("TreatmentEndDate");
		assertEquals(t1, t1);
		assertEquals(t1.hashCode(), t1.hashCode());
		assertEquals(t1.toString(), t1.toString());
		assertEquals(1, treatmentplan.getId());
		assertEquals("packagename", treatmentplan.getPackagename());
		assertEquals("testdetails", treatmentplan.getTestdetails());
		assertEquals(2000, treatmentplan.getCost());
		assertEquals("specialist", treatmentplan.getSpecialist());
		assertEquals("treatmentcommencementdate", treatmentplan.getTreatmentcommencementdate());
		assertEquals("treatmentcommencementdate", treatmentplan.getTreatmentcommencementdate());
	}

}
