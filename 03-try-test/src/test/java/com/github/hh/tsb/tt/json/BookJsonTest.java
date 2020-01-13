package com.github.hh.tsb.tt.json;

import com.github.hh.tsb.tt.model.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class BookJsonTest {

    @Autowired
    private JacksonTester<Book> json;

    @Test
    public void test() throws IOException {
        Book book = new Book("dummyId", "dummyName");
        JsonContent<Book> write = this.json.write(book);
        assertThat(write).hasJsonPathStringValue("@.id");
    }
}
