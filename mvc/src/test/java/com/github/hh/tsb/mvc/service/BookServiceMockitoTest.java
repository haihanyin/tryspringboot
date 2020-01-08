package com.github.hh.tsb.mvc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.github.hh.tsb.mvc.model.Book;
import com.github.hh.tsb.mvc.repository.BookRepository;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceMockitoTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;


    @Test
    public void test() {
        int bookId = 1;
        String expectedBookName = "myBook";
        float expectedPrice = 1.23f;
        Mockito.when(bookRepository.findById(bookId)).thenReturn(new Book(expectedBookName, expectedPrice));

        Book book = bookService.getBook(bookId);
        assertEquals(book.getName(), expectedBookName);
        assertEquals(book.getPrice(), expectedPrice, 0);
    }


}