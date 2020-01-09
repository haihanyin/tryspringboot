package com.github.hh.tsb.mvc.repository;

import com.github.hh.tsb.mvc.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);
}
