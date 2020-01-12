package com.github.hh.tsb.tt.controller;

import com.github.hh.tsb.tt.dto.BookDto;
import com.github.hh.tsb.tt.model.Book;
import com.github.hh.tsb.tt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/get/{id}")
    public String getBook(@PathVariable String id, Model model) {
        Optional<Book> book = bookService.getBook(id);
        model.addAttribute("book", book.orElse(null));
        return "showBook";
    }

}
