package com.github.hh.tsb.tec.model;

public class Fruit {

    private String id;

    private String name;

    private Fruit() {}

    public Fruit(String id, String name) {
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
