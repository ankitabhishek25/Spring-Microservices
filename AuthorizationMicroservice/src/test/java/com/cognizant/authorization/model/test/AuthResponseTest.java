package com.cognizant.authorization.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.authorization.model.AuthResponse;

@ExtendWith(MockitoExtension.class)
public class AuthResponseTest {
   
	private AuthResponse user;
	
	 @BeforeEach()
	    public void setUp() {
	        user = new AuthResponse();
	        user.setUid("mock_uid");
	        user.setName("mock_name");
	        user.setValid(true);
	    }

	    @Test
	    public void testAllGettersAndSetters() {
	        assertEquals("mock_uid", user.getUid());
	        assertEquals("mock_name",user.getName());
	        assertEquals(true, user.isValid());
	        
	    }
}
