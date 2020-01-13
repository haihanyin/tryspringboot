package com.github.hh.tsb.tt.repository;

import com.github.hh.tsb.tt.model.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void test() {
        testEntityManager.persist(new Book("1", "dummyBook"));
        Optional<Book> book = bookRepository.findById("1");
        assertThat(book.get()).isNotNull();
    }
}