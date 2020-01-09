package com.github.mocklib;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MocklibApplicationListener implements ApplicationListener<SpringApplicationEvent> {

    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
        System.out.println("MocklibApplicationListener-" + event.getClass().getSimpleName());
    }
}
