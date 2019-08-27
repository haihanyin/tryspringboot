package p.hh.tsb.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import p.hh.tsb.mvc.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);
}
