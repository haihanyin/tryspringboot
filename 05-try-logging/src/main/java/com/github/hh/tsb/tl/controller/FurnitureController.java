package com.github.hh.tsb.tl.controller;

import com.github.hh.tsb.tl.model.Furniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/furniture")
public class FurnitureController {


    private static final List<Furniture> furnitureList;

    static {
        furnitureList = new ArrayList<>(8);
        furnitureList.add(new Furniture(UUID.randomUUID().toString(), "desk"));
        furnitureList.add(new Furniture(UUID.randomUUID().toString(), "chair"));
        furnitureList.add(new Furniture(UUID.randomUUID().toString(), "table"));
        furnitureList.add(new Furniture(UUID.randomUUID().toString(), "frame"));
        furnitureList.add(new Furniture(UUID.randomUUID().toString(), "door"));
    }

    @GetMapping("/get/{index}")
    public Furniture getBook(@PathVariable int index) {
        return furnitureList.get(index);
    }

}
