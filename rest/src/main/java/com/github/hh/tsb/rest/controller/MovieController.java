package com.github.hh.tsb.rest.controller;

import com.github.hh.tsb.rest.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final static List<Movie> MOVIES;

    static {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(UUID.randomUUID().toString(), "3 Idiots"));
        movieList.add(new Movie(UUID.randomUUID().toString(), "Black Hawk Down"));
        movieList.add(new Movie(UUID.randomUUID().toString(), "Cast Away"));
        movieList.add(new Movie(UUID.randomUUID().toString(), "Good Burger"));
        movieList.add(new Movie(UUID.randomUUID().toString(), "Hero"));
        MOVIES = Collections.unmodifiableList(movieList);
    }

    @GetMapping("/get/{index}")
    public Movie getBook(@PathVariable int index) {
        Movie movie = MOVIES.get(index);
        return movie;
    }

}
