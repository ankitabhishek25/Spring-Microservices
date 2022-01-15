package com.cognizant.hospital.management.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.hospital.management.model.InitiateClaim;
import com.cognizant.hospital.management.repository.InitiateClaimRepo;
import com.cognizant.hospital.management.services.InitiateClaimService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class InitiateClaimCheckServiceTest {

	@Mock
	public InitiateClaimRepo repo;
	public InitiateClaimService service;
	@Mock
	public InitiateClaim entity;
	
	@BeforeEach
	public void setUp()
	{
		service = new InitiateClaimService(repo);
		entity = new InitiateClaim("Aman", "Ortho", "P1","Apollo" );
	}
	
	@Test
	public void testGetByName() {
		when(repo.findByInsurerName("Apollo")).thenReturn(entity);
		assertEquals(repo.findByInsurerName("Apollo"),service.getByName("Apollo"));
	}
	
	
}
