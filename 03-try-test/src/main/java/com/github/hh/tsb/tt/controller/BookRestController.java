package com.github.hh.tsb.tt.controller;

import com.github.hh.tsb.tt.dto.BookDto;
import com.github.hh.tsb.tt.model.Book;
import com.github.hh.tsb.tt.service.BookService;
import com.sun.deploy.net.HttpResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@RequestMapping("/rest/book")
public class BookRestController {

    private BookService bookService;

    private ModelMapper modelMapper;

    @Autowired
    public BookRestController(BookService bookService, ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/get/{id}")
    public BookDto getBook(@PathVariable String id, Model model, HttpServletResponse response) {
        Optional<Book> book = bookService.getBook(id);
        if (book.isPresent()) {
            return modelMapper.map(book, BookDto.class);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
    }

}
