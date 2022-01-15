 package com.cognizant.hospital.management.controller.test;
  
  import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cognizant.hospital.management.controller.InitiateClaimController;
	  
  @SpringBootTest
  @ExtendWith(MockitoExtension.class)
  @WebAppConfiguration 
  class InsuranceClaimControllerTest {
  


	
	  
  private MockMvc mockMvc;
  
  @Autowired
  private InitiateClaimController insuranceClaimController;
  
  private String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBZG1pbiIsImV4cCI6MTU5Njg3MTU3NywiaWF0IjoxNTk2ODcwOTc3fQ.AwIGwjo6YqDrbotzveWTBbOpjmMN3IBmC361fx2fcp4";
  
  
  @BeforeEach 
  public void setUp() throws Exception{ 
	  mockMvc = MockMvcBuilders
			  .standaloneSetup(insuranceClaimController).build();
	
  }
  
 /* @Test 
  public void testInsurerClaim() throws Exception{
   mockMvc.perform(get("/insurance/GetAllInsurerDetail")
		   .header("Authorization", "Bearer "+token)
		   .accept(MediaType.APPLICATION_JSON));
   }
  */
  @Test 
  public void testInsurerClaim1() throws Exception{
   mockMvc.perform(post("/insurance/InitiateClaim")
		   .header("Authorization", "Bearer "+token)
		   .accept(MediaType.APPLICATION_JSON));
   }
    
  	@Test
  	void test()
  	{
  		assertNotNull(insuranceClaimController);
  	}
 }
 