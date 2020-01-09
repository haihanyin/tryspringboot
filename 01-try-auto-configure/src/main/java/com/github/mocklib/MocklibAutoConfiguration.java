package com.github.mocklib;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(prefix = "movie.service", value = "type", havingValue = "mock")
public class MocklibAutoConfiguration {

    @Bean
    public MovieService movieService() {
        return new MovieServiceImpl();
    }
}
