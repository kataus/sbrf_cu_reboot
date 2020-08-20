package ru.sbrf.cu.spring.microservice.repostory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.sbrf.cu.spring.microservice.domain.Person;

import java.util.List;

@RepositoryRestResource(path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

    List<Person> findAll();

    @RestResource(path = "names", rel = "names")
    List<Person> findByName(String name);
}
