package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.model.AilmentModel;
import com.cognizant.treatment.offerings.model.Packageee;

@ExtendWith(MockitoExtension.class)
class PackageeeTest {

	private Packageee pack;

	@BeforeEach
	public void setUp() {
		pack = new Packageee();
		AilmentModel ailment = new AilmentModel();
		pack = new Packageee(1, "packageName", "testDetails", 2000, 5, ailment);
		pack.setAilment(ailment);
		pack.setCost(2000);
		pack.setDuration(5);
		pack.setId(1);
		pack.setPackageName("packageName");
		pack.setTestDetails("testDetails");
	}

	@Test
	public void testAllGetterSetterConstructor() {
		AilmentModel ailment1 = new AilmentModel();
		Packageee p1 = new Packageee();
		p1.setAilment(ailment1);
		p1.setCost(2000);
		p1.setDuration(5);
		p1.setId(1);
		p1.setPackageName("packageName");
		p1.setTestDetails("testDetails");
		Packageee p2 = new Packageee();
		p2.setAilment(ailment1);
		p2.setCost(2000);
		p2.setDuration(5);
		p2.setId(1);
		p2.setPackageName("packageName");
		p2.setTestDetails("testDetails");
		assertEquals(2000, pack.getCost());
		assertEquals(5, pack.getDuration());
		assertEquals(1, pack.getId());
		assertEquals("packageName", pack.getPackageName());
		assertEquals("testDetails", pack.getTestDetails());
		assertEquals(p1.toString(), p2.toString());
		assertEquals(1, pack.getId());
		assertEquals("packageName", pack.getPackageName());
		assertEquals("testDetails", pack.getTestDetails());
		assertEquals(2000, pack.getCost());
		assertEquals(5, pack.getDuration());
		//assertEquals(ailment1, pack.getAilment());
	}

}
