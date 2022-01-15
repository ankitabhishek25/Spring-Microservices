package com.cognizant.authorization.model.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.cognizant.authorization.model.UserLoginCredential;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserLoginCredentialTest {

    private UserLoginCredential user;

    @BeforeEach
    public void setUp() {
        user = new UserLoginCredential();
        user.setUid("mock_uid");
        user.setPassword("mock_password");
    }

    @Test
    public void testGettersSetters() {
        assertEquals("mock_uid", user.getUid());
        assertEquals("mock_password", user.getPassword());
    }
}