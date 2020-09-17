package guru.springframework.spring5webapplication.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapplication.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
