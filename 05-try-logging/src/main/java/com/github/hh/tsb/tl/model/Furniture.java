package com.github.hh.tsb.tl.model;

public class Furniture {

    private String id;

    private String name;

    private Furniture() {}

    public Furniture(String id, String name) {
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
