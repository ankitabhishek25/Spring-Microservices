package com.cognizant.authorization.model.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.authorization.model.UserInternationalPatientTreatment;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class UserInternationalPatientTreatmentTest {

    private UserInternationalPatientTreatment users;

    @BeforeEach()
    public void setUp() {
        users = new UserInternationalPatientTreatment();
        users.setUserid("123");
        users.setUpassword("mock_password");
        users.setUname("mock_name");
    }

    @Test
    public void testAllGettersAndSetters() {
        assertEquals("123", users.getUserid());
        assertEquals("mock_password",users.getUpassword());
        assertEquals("mock_name", users.getUname());
        
    }
}