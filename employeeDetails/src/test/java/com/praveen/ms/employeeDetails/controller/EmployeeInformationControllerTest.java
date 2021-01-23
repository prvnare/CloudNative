package com.praveen.ms.employeeDetails.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class EmployeeInformationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employee/info/v1/ping"))
                .andExpect(status().isOk())
                .andExpect(mvcResult -> mvcResult.getResponse().getContentAsString().equals("Ping Success"));
    }

    @Test
    public void testGetEmployeeDetails() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/employee/info/v1/123/details"))
                .andExpect(status().isOk());
    }

}