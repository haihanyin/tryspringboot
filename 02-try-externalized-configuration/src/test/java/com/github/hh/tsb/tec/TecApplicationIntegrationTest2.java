package com.github.hh.tsb.tec;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = TecApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(properties = "tsb.tec.prop.from=TestPropertySource")
public class TecApplicationIntegrationTest2 {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/car/propertyisfrom")).andReturn();
        System.out.printf(mvcResult.getResponse().getContentAsString());
    }

}
