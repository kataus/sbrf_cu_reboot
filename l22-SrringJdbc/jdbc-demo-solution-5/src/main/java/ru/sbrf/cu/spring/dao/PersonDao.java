package ru.sbrf.cu.spring.dao;

import ru.sbrf.cu.spring.domain.Person;

import java.util.List;

public interface PersonDao {

    int count();

    void insert(Person person);

    Person getById(long id);

    List<Person> getAll();
}
