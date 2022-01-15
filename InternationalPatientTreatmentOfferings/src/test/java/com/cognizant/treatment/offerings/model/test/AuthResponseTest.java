package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.model.AuthResponse;

@ExtendWith(MockitoExtension.class)

class AuthResponseTest {
	private AuthResponse auth;

	@BeforeEach
	public void setUp() {
		auth = new AuthResponse("uid", "name", false);
		auth = new AuthResponse();
		auth.setName("name");
		auth.setUid("uid");
		auth.setValid(false);
	}

	@Test
	public void testAllGetterSetterConstructor() {
		assertEquals("name", auth.getName());
		assertEquals("uid", auth.getUid());
		assertEquals("uid", auth.getUid());
		assertEquals("name", auth.getName());
		assertEquals(false, auth.isValid());
	}

}
