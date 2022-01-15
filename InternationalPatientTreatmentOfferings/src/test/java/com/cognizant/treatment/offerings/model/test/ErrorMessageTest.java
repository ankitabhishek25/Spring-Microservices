package com.cognizant.treatment.offerings.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.treatment.offerings.model.ErrorMessage;

@ExtendWith(MockitoExtension.class)
class ErrorMessageTest {

	private ErrorMessage error;

	@BeforeEach
	public void setUp() {
		error = new ErrorMessage("errorMessage", 5, "documentation");
		error = new ErrorMessage();
		error.setDocumentation("documentation");
		error.setErrorCode(5);
		error.setErrorMessage("errorMessage");
	}

	@Test
	public void testAllGetterSetterConstructor() {
		error = new ErrorMessage("errorMessage", 5, "documentation");
		assertEquals("documentation", error.getDocumentation());
		assertEquals(5, error.getErrorCode());
		assertEquals("errorMessage", error.getErrorMessage());
		assertEquals("errorMessage", error.getErrorMessage());
		assertEquals(5, error.getErrorCode());
		assertEquals("documentation", error.getDocumentation());
	}
}
