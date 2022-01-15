package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognizant.treatment.proxy.AilmentModel;
import com.cognizant.treatment.proxy.Packageee;
import com.cognizant.treatment.proxy.SpecialistDetailsModel;

class PackageeeTest {

	private Packageee pack;

	@BeforeEach
	public void setUp() {
		Packageee pt = new Packageee();

		pack = new Packageee(1, "packageName", "testDetails", 2000, 5, null);
	}

	@Test
	public void testAllGetterSetterConstructors() {
		Packageee p1 = new Packageee();
		Packageee p2 = new Packageee();
		AilmentModel ailment = new AilmentModel();
		ailment.setId(1);
		ailment.setName("name");
		List<SpecialistDetailsModel> doctors = new ArrayList<>();
		SpecialistDetailsModel e = new SpecialistDetailsModel();
		e.setAreaofExperties("AreaofExperties");
		e.setContactNo("contactNo");
		e.setExperiences(5);
		e.setId(1);
		e.setName("Name");
		doctors.add(e);
		ailment.setDoctors(doctors);
		p1.setAilment(ailment);
		p1.setCost(2000);
		p1.setDuration(4);
		p1.setId(1);
		p1.setPackageName("packageName");
		p1.setTestDetails("testDetails");
		p2.setAilment(ailment);
		p2.setCost(2000);
		p2.setDuration(4);
		p2.setId(1);
		p2.setPackageName("packageName");
		p2.setTestDetails("testDetails");
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		assertEquals(p1.toString(), p2.toString());
		assertEquals(1, pack.getId());
		assertEquals("packageName", pack.getPackageName());
		assertEquals("testDetails", pack.getTestDetails());
		assertEquals(2000, pack.getCost());
		assertEquals(5, pack.getDuration());
		assertEquals(null, pack.getAilment());
	}

}
