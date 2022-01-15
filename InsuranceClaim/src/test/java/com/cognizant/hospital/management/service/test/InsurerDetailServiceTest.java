package com.cognizant.hospital.management.service.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

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
class InsurerDetailServiceTest {
	@Mock
	InsurerDetailRepo repo ; 
	
	
	public InsurerDetailService service ;
	
	public InsurerDetail entity;
	
	@BeforeEach
	public void setUp() {
	
		service = new InsurerDetailService(repo);
		entity = new InsurerDetail("Apollo", "ABC", 200.0, 10.0);
		
	}

	@Test
	public void checkAllInsurerDetail() throws RuntimeException{
		
		List<InsurerDetail> idList = new ArrayList<>();
		idList.add(entity);
		when(repo.findAll()).thenReturn(idList);
		List<InsurerDetail> insurerDetail = service.getAllInsurerDetails();
		assertEquals(entity.getInsurerName(),insurerDetail.get(0).getInsurerName());
		
	} 

	@Test
	public void checkInsurerByPackageName() {
		List<InsurerDetail> idList = new ArrayList<>();
		idList.add(entity);
		when(repo.findByInsurerPackageName("ABC")).thenReturn(idList);
		List<InsurerDetail> insurerDetail = service.getInsurerByPackage("ABC");
		assertEquals(entity.getInsurerPackageName(),insurerDetail.get(0).getInsurerPackageName());
	}
	
	@Test 
	public void checkGetInsurerByInsurerName() {
		List<InsurerDetail> idList = new ArrayList<>();
		idList.add(entity);
		when(repo.findByInsurerName("Apollo")).thenReturn(idList);
		List<InsurerDetail> insurerDetails = service.getInsurerByInsurerName("Apollo");
		assertEquals(entity.getInsurerName(), insurerDetails.get(0).getInsurerName());
	}
}
