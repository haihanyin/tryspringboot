package p.hh.tsb.mvc.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import p.hh.tsb.mvc.model.Book;
import p.hh.tsb.mvc.service.BookService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private BookService bookService;

    @Test
    public void test() throws Exception {
        int bookId = 1;
        String expectedBookName = "myBook";
        float expectedPrice = 1.23f;
        Mockito.when(bookService.getBook(bookId)).thenReturn(new Book(expectedBookName, expectedPrice));

        mvc.perform(get("/book/get/" + bookId))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string(Matchers.containsString(expectedBookName)));
    }
}