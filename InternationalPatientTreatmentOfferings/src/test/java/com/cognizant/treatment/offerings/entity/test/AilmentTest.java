package com.cognizant.treatment.offerings.entity.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.Entity.Ailment;
import com.cognizant.treatment.offerings.Entity.PackageDetails;
import com.cognizant.treatment.offerings.Entity.SpecialistDetails;

@ExtendWith(MockitoExtension.class)
class AilmentTest {

	private Ailment ailment;

	@BeforeEach
	public void setUp() {
		ailment = new Ailment();
		ailment.setId(1);
		ailment.setName("name");
		List<PackageDetails> packagedetails = new ArrayList<>();
		ailment.setPackagedetails(packagedetails);
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		ailment.setSpecialistdetails(specialistdetails);
		ailment = new Ailment(1, "name", packagedetails, specialistdetails);

	}

	@Test
	public void testAllGetterSetterConstructor() {

		List<PackageDetails> packagedetails = new ArrayList<>();
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		Ailment a1 = new Ailment();
		a1.setId(1);
		a1.setName("name");
		a1.setPackagedetails(packagedetails);
		a1.setSpecialistdetails(specialistdetails);
		Ailment a2 = new Ailment();
		a2.setId(1);
		a2.setName("name");
		a2.setPackagedetails(packagedetails);
		a2.setSpecialistdetails(specialistdetails);
		assertEquals(1, ailment.getId());
		assertEquals("name", ailment.getName());
		assertEquals(packagedetails, ailment.getPackagedetails());
		assertEquals(specialistdetails, ailment.getSpecialistdetails());
		assertEquals(1, ailment.getId());
		assertEquals("name", ailment.getName());
		assertEquals(packagedetails, ailment.getPackagedetails());
		assertEquals(specialistdetails, ailment.getSpecialistdetails());
		// assertEquals(a1, a2);
		// assertEquals(a1.hashCode(), a2.hashCode());
		// assertEquals(a1.toString(), a2.toString());
	}

}
