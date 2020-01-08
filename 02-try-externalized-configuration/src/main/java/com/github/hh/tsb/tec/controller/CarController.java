package com.github.hh.tsb.tec.controller;

import com.github.hh.tsb.tec.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car")
public class CarController {

    @Value("${tsb.tec.prop.from}")
    private String tecProperty;

    private final static List<Car> CARS;

    static {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(UUID.randomUUID().toString(), "Acura"));
        carList.add(new Car(UUID.randomUUID().toString(), "BMW"));
        carList.add(new Car(UUID.randomUUID().toString(), "Cadillac"));
        carList.add(new Car(UUID.randomUUID().toString(), "Ford"));
        carList.add(new Car(UUID.randomUUID().toString(), "Honda"));
        CARS = Collections.unmodifiableList(carList);
    }

    @GetMapping("/get/{index}")
    public Car getBook(@PathVariable int index) {
        return CARS.get(index);
    }

    @GetMapping("/propertyisfrom")
    public String readProperty() {
        return tecProperty;
    }
}
