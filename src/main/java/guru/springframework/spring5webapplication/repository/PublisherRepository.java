package guru.springframework.spring5webapplication.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapplication.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
