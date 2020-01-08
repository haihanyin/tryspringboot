package com.github.hh.tsb.tec.model;

public class Car {

    private String id;

    private String name;

    private Car() {}

    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
