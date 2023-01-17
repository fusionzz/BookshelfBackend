package daos;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
