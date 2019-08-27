package p.hh.tsb.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hh.tsb.mvc.model.Book;
import p.hh.tsb.mvc.repository.BookRepository;

@Service
public class BookService {

    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book getBook(int id) {
        return repository.findById(id);
    }

}
