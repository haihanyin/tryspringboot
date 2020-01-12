package com.github.hh.tsb.tt.controller;


import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.github.hh.tsb.tt.model.Book;
import com.github.hh.tsb.tt.service.BookService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@WebMvcTest(BookController.class)
class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebClient webClient;

    @MockBean
    private BookService bookService;

    @Test
    void getBook() throws Exception {
        when(bookService.getBook(anyString()))
                .thenReturn(Optional.of(new Book("dummyId", "dummyName")));
        WebResponse webResponse = webClient.getPage("/book/get/1").getWebResponse();
        assertThat(webResponse.getContentAsString()).contains("book id").contains("book name");
    }
}