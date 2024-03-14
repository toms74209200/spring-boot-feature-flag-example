package io.github.toms74209200.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@ActiveProfiles("prod")
@AutoConfigureMockMvc
@SpringBootTest
public class GreeterControllerProdTest {

    @Test
    public void testGreet(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(get("/greet")).andExpect(status().isNotFound());
    }
}
