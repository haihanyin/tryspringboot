package com.github.mocklib;

import com.github.hh.tsb.tec.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class MovieServiceImpl implements MovieService{

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

    @Override
    public Movie getMovie(int index) {
        return MOVIES.get(index);
    }
}
