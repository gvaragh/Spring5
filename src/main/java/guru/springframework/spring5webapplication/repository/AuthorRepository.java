package guru.springframework.spring5webapplication.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapplication.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
