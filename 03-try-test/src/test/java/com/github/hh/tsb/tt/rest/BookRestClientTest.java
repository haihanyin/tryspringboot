package com.github.hh.tsb.tt.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest
public class BookRestClientTest {

    @Autowired
    private MockRestServiceServer mockServer;

    @Test
    void test() {
        this.mockServer.expect(requestTo("/greeting"))
                .andRespond(withSuccess("hello", MediaType.TEXT_PLAIN));
    }
}
