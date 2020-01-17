package com.github.hh.tsb.ta.httptrace;

import org.springframework.boot.actuate.trace.http.HttpExchangeTracer;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.web.trace.servlet.HttpTraceFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Component
public class CustomTraceFilter extends HttpTraceFilter {
    /**
     * Create a new {@link HttpTraceFilter} instance.
     *
     * @param repository the trace repository
     * @param tracer     used to trace exchanges
     */
    public CustomTraceFilter(HttpTraceRepository repository, HttpExchangeTracer tracer) {
        super(repository, tracer);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return request.getServletPath().contains("actuator");
    }
}
