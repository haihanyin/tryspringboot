package com.github.hh.tsb.tec.controller;

import com.github.hh.tsb.tec.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final static List<Fruit> CARS;

    static {
        List<Fruit> carList = new ArrayList<>();
        carList.add(new Fruit(UUID.randomUUID().toString(), "Apple"));
        carList.add(new Fruit(UUID.randomUUID().toString(), "Banana"));
        carList.add(new Fruit(UUID.randomUUID().toString(), "Cherry"));
        carList.add(new Fruit(UUID.randomUUID().toString(), "Melon"));
        carList.add(new Fruit(UUID.randomUUID().toString(), "Peach"));
        CARS = Collections.unmodifiableList(carList);
    }

    @GetMapping("/get/{index}")
    public Fruit getBook(@PathVariable int index) {
        return CARS.get(index);
    }

}
