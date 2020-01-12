package com.github.hh.tsb.tt.dto;

public class BookDto {

    private String id;

    private String name;

    private BookDto() {}

    public BookDto(String id, String name) {
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
