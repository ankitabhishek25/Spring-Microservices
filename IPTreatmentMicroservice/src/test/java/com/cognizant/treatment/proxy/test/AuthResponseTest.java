package com.cognizant.treatment.proxy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.proxy.AuthResponse;

@ExtendWith(MockitoExtension.class)
class AuthResponseTest {

	private AuthResponse auth;

	@BeforeEach
	public void setUp() {
		AuthResponse ar = new AuthResponse();
		auth = new AuthResponse("uid", "name", false);
	}

	@Test
	public void testAllGetterSetterConstructors() {
		AuthResponse ar = new AuthResponse();
		AuthResponse ar2 = new AuthResponse();
		ar.setName("Name");
		ar.setUid("Uid");
		ar.setValid(false);
		ar2.setName("Name");
		ar2.setUid("Uid");
		ar2.setValid(false);
		assertEquals(ar, ar2);
		assertEquals(ar.hashCode(), ar2.hashCode());
		assertEquals(ar.toString(), ar2.toString());
		assertEquals("uid", auth.getUid());
		assertEquals("name", auth.getName());
		assertEquals(false, auth.isValid());
	}

}
