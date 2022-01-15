package com.cognizant.hospital.management.model.test;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.hospital.management.MyFilter;

@SpringBootTest
public class FilterTest {

	@Mock
	MyFilter my;
	FilterConfig fc;
	ServletRequest sr;
	ServletResponse sr1;
	FilterChain fc1;
	@BeforeEach
	void setUp() {
		my = new MyFilter();
	}
	
	@Test
	public void filterTest() throws ServletException, IOException {
		my.init(fc);
		//my.doFilter(sr, sr1, fc1);
		my.destroy();
	}
	
}
