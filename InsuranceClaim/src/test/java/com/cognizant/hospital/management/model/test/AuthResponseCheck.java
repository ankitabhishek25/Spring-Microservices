package com.cognizant.hospital.management.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.hospital.management.model.AuthResponse;

@ExtendWith(MockitoExtension.class)
class AuthResponseCheck {

	private AuthResponse authResponse;
	private AuthResponse au;
	
	@BeforeEach
	public void setUp() {
		
		au = new AuthResponse("Somu", "AB2", true);
		authResponse = new AuthResponse();
		authResponse.setName("Ankit");
		authResponse.setUid("AB1");
		authResponse.setValid(true);
	}
	@Test
	void testAllGetterSetters() {
		 AuthResponse a1 = new AuthResponse();
		
		a1.setName("aa");
		a1.setUid("ab");
		a1.setValid(true);
		assertEquals("Ankit", authResponse.getName());
		assertEquals("AB1", authResponse.getUid());
		assertEquals(true, authResponse.isValid());
		assertEquals("Somu", au.getUid());
		assertEquals("AB2",au.getName());
		assertEquals(true, au.isValid());
		assertEquals(a1, a1);
		assertEquals(a1.hashCode(), a1.hashCode());
		assertEquals(a1.toString(), a1.toString());
	}

}
