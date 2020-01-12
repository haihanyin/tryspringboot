package com.github.hh.tsb.tt.service;

import com.github.hh.tsb.tt.dto.BookDto;
import com.github.hh.tsb.tt.model.Book;
import com.github.hh.tsb.tt.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBook(String id) {
        return bookRepository.findById(id);
    }
}
