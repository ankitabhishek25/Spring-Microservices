package com.cognizant.hospital.management.model.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.hospital.management.model.InsurerDetail;
import com.cognizant.hospital.management.repository.InsurerDetailRepo;
import com.cognizant.hospital.management.services.InsurerDetailService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class InsurerDetailServiceTest1 {

	@Mock
	public InsurerDetailRepo repo;
	public InsurerDetailService service;
	@Mock
	public InsurerDetail entity;
	public InsurerDetail entity1;
	public InsurerDetail e;
	

	@BeforeEach
	public void setUp() {
		service = new InsurerDetailService(repo);
		entity = new InsurerDetail("Apollo", "ABC", 200.0, 10.0);
		e = new InsurerDetail("Apollo", "ABC", 200.0, 10.0);
		entity1= new InsurerDetail();
	}
	
	@Test
	public void checkInsurerDetailService() {
		entity1.setDisbursementDuration(10.0);
		entity1.setInsuranceAmountLimit(200.0);
		entity1.setInsurerName("LIC");
		entity1.setInsurerPackageName("ABC");
		assertEquals("Apollo", entity.getInsurerName());
		assertEquals("ABC", entity.getInsurerPackageName());
		assertEquals(200.0, Double.valueOf(entity.getInsuranceAmountLimit()));
		assertEquals(10.0, Double.valueOf(entity.getDisbursementDuration()));
		assertEquals(entity1, entity1);
		assertEquals(entity1.hashCode(),entity1.hashCode() );
		assertEquals(entity1.toString(), entity1.toString());
		assertEquals(e.getDisbursementDuration(), entity.getDisbursementDuration());
		assertEquals(e.getInsuranceAmountLimit(),entity.getInsuranceAmountLimit());
		assertEquals(e.getInsurerName(),entity.getInsurerName());
		assertEquals(e.getInsurerPackageName(), entity.getInsurerPackageName());
		assertEquals(e.toString(), entity.toString());
		assertEquals(e, entity);
		assertEquals(e.hashCode(), entity.hashCode());
	}
	

	


}
