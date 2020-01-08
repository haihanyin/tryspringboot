package com.github.hh.tsb.mvc.controller;

import com.github.hh.tsb.mvc.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.github.hh.tsb.mvc.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/get/{id}")
    public ModelAndView getBook(@PathVariable int id, ModelAndView mav) {
        Book book = bookService.getBook(id);
        mav.addObject(book);
        mav.setViewName("readBook");
        return mav;
    }

}
