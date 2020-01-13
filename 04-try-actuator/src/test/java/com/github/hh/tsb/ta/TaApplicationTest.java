package com.github.hh.tsb.ta;

import com.github.hh.tsb.tec.TaApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = TaApplication.class)
@AutoConfigureMockMvc
public class TaApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/actuator/health"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}