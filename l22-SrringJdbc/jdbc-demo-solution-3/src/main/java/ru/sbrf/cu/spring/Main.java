package ru.sbrf.cu.spring;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.sbrf.cu.spring.dao.PersonDao;
import ru.sbrf.cu.spring.domain.Person;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(Main.class);

        PersonDao dao = context.getBean(PersonDao.class);

        System.out.println("All count " + dao.count());



        Console.main(args);
    }
}
