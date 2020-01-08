package com.github.hh.tsb.rest.model;

public class Movie {

    private String id;

    private String name;

    private Movie() {}

    public Movie(String id, String name) {
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
