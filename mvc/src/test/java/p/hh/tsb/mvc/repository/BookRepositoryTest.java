package p.hh.tsb.mvc.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import p.hh.tsb.mvc.model.Book;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource(properties = "spring.datasource.data=classpath:data-test.sql")
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void test() {

        entityManager.persist(new Book("firstBook", 1.23f));
        entityManager.persist(new Book("secondBook", 4.56f));

        List<Book> all = bookRepository.findAll();
        Book book = bookRepository.findById(2);
        assertEquals(book.getName(), "secondBook");
        assertEquals(book.getPrice(), 4.56f, 0);
    }
}