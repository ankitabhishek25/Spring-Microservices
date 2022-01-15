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
class PackageDetailsTest {
	private PackageDetails pd;

	@BeforeEach
	public void setUp() {
		List<PackageDetails> packagedetails = new ArrayList<>();
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		pd = new PackageDetails();
		Ailment ailment = new Ailment();
		pd = new PackageDetails(1, "packageName", "testDetails", 2000, 5, ailment);
		ailment.setId(1);
		ailment.setName("name");
		ailment.setPackagedetails(packagedetails);
		ailment.setSpecialistdetails(specialistdetails);
		pd.setAilment(ailment);
		pd.setCost(2000);
		pd.setDuration(5);
		pd.setId(1);
		pd.setPackageName("packageName");
		pd.setTestDetails("testDetails");

	}

	@Test
	public void testAllGetterSetterConstructor() {

		List<PackageDetails> packagedetails = new ArrayList<>();
		List<SpecialistDetails> specialistdetails = new ArrayList<>();
		assertEquals(1, pd.getId());
		assertEquals("packageName", pd.getPackageName());
		assertEquals(2000, pd.getCost());
		assertEquals(5, pd.getDuration());
		assertEquals("testDetails", pd.getTestDetails());
		Ailment ailment2 = new Ailment();
		ailment2.setId(1);
		ailment2.setName("name");
		ailment2.setPackagedetails(packagedetails);
		ailment2.setSpecialistdetails(specialistdetails);
		PackageDetails p = new PackageDetails();
		PackageDetails p2 = new PackageDetails();
		p.setAilment(ailment2);
		p.setCost(2000);
		p.setDuration(5);
		p.setId(1);
		p.setPackageName("packageName");
		p.setTestDetails("testDetails");
		p2.setAilment(ailment2);
		p2.setCost(2000);
		p2.setDuration(5);
		p2.setId(1);
		p2.setPackageName("packageName");
		p2.setTestDetails("testDetails");
		assertEquals(p, p2);
		assertEquals(p.hashCode(), p2.hashCode());
		assertEquals(p.toString(), p2.toString());
		assertEquals(1, pd.getId());
		assertEquals("packageName", pd.getPackageName());
		assertEquals("testDetails", pd.getTestDetails());
		assertEquals(2000, pd.getCost());
		assertEquals(5, pd.getDuration());
		//Ailment ailment3 = new Ailment();
		//ailment3.setId(1);
		//ailment3.setName("name");
		//assertEquals(ailment3, pd.getAilment());
		// assertEquals(ailment2, pd.getAilment());
	}

}
