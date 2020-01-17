package com.github.hh.tsb.ta.httptrace;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomTraceService implements HttpTraceRepository {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<HttpTrace> findAll() {
        return null;
    }

    @Override
    public void add(HttpTrace trace) {
        try {
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(trace));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
