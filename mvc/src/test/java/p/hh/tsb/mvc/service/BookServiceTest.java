package p.hh.tsb.mvc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import p.hh.tsb.mvc.model.Book;
import p.hh.tsb.mvc.repository.BookRepository;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class BookServiceTest {

    @TestConfiguration
    static class ContextConfiguration {

        @Bean
        @Autowired
        public BookService bookService(BookRepository bookRepository) {
            return new BookService(bookRepository);
        }
    }

    @Autowired
    private BookService bookService;

    @MockBean
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