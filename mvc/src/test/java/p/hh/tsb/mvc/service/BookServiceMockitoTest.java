package p.hh.tsb.mvc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import p.hh.tsb.mvc.model.Book;
import p.hh.tsb.mvc.repository.BookRepository;

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