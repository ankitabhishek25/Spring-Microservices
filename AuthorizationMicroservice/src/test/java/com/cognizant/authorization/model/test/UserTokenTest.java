package com.cognizant.authorization.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.authorization.model.UserToken;

@ExtendWith(MockitoExtension.class)
class UserTokenTest {

	private UserToken user;

    @BeforeEach()
    public void setUp() {
        user = new UserToken();
        user.setUid("123");
        user.setAuthToken("mock_token");
    }

    @Test
    public void testAllGettersAndSetters() {
        assertEquals("123", user.getUid());
        assertEquals("mock_token",user.getAuthToken());
    }

}
