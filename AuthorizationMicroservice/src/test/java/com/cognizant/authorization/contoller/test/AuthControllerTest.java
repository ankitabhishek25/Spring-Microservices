package com.cognizant.authorization.contoller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cognizant.authorization.model.UserLoginCredential;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class AuthControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;
    private UserLoginCredential userlogin;

    @BeforeEach
    public void setUp() throws Exception {
    	userlogin = new UserLoginCredential();
    	userlogin.setUid("1");
        userlogin.setPassword("password");
        mockMvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
        		
    }


	@Test
    public void testAuthenticationisSuccessfulwhenTheUserExists() throws Exception {
        mockMvc.perform(post("/auth/login").contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(userlogin))).andExpect(status().isOk());
    }

//    @Test
//    public void testAuthentication_isSuccessful_andReturnsToken() throws Exception {
//        String token = mockMvc.perform(post("/auth/valid").contentType(MediaType.APPLICATION_JSON)
//                .content(new ObjectMapper().writeValueAsString(userlogin)))
//                .andExpect(status().isOk()).andReturn().getResponse().getHeader("Authorization");
//        System.out.println(token+"            TOKEN");
//        assertTrue(token.startsWith("Bearer "));
//    }

    @Test
    public void testAuthenticationisUnsuccessfulwhenPassedInvalidUserDetails() throws Exception {
    	userlogin = new UserLoginCredential();
        userlogin.setUid("1");
        userlogin.setPassword("password1");
        mockMvc.perform(post("/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(userlogin)))
                .andExpect(status().isUnauthorized());
    }
    
    

    @Test
    public void testAuthenticationisValidToken() throws Exception {
    	
    	 
    	userlogin = new UserLoginCredential();
        userlogin.setUid("1");
        userlogin.setPassword("password");
        MvcResult ra =mockMvc.perform(post("/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(userlogin))).andReturn();
    	
             ;
             
    	String  resStr = ra.getResponse().getContentAsString();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	Map<String, String> jsonMap = new HashMap<String, String>();
        
        // convert JSON string to Map
        jsonMap = mapper.readValue(resStr,
                new TypeReference<Map<String, String>>(){});
        
        String token = jsonMap.get("authToken");
        mockMvc.perform(get("/auth/validate").header("Authorization", "Bearer "+token))
                .andExpect(status().isOk());
    	
    }
    
}
