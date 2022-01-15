package com.cognizant.hospital.management.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.hospital.management.exception.ApiRequestException;

@ExtendWith(MockitoExtension.class)
class ApiRequestExceptionTest {

	private ApiRequestException are;
	private ApiRequestException are1;
	private Throwable tt;
	
	@Test
	public void testConstructors() {
		are = new ApiRequestException("Hello");
		are1 = new ApiRequestException("test",tt );
		assertEquals(are, are);
		assertEquals(are1, are1);
				
	}
	
}
