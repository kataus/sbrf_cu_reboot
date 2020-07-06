package ru.sbrf.cu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.map.repository.config.EnableMapRepositories;
import ru.sbrf.cu.spring.domain.Person;
import ru.sbrf.cu.spring.repostory.PersonRepository;

import javax.annotation.PostConstruct;

@EnableMapRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void init() {
        repository.save(new Person("Pushkin"));
    }
}
