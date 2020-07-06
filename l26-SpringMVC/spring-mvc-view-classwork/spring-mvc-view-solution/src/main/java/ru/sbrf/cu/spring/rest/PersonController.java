package ru.sbrf.cu.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.sbrf.cu.spring.domain.Person;
import ru.sbrf.cu.spring.repostory.PersonRepository;

import java.util.List;

@Controller
public class PersonController {

    private final PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String listPage(Model model) {
        List<Person> persons = repository.findAll();
        model.addAttribute("persons", persons);
        return "list";
    }

    @GetMapping("/edit")
    public String editPage(@RequestParam("id") int id, Model model) {
        Person person = repository.findById(id).orElseThrow(NotFoundException::new);
        model.addAttribute("person", person);
        return "edit";
    }
    
    @PostMapping("/edit")
    public String savePerson(
            Person person,
            Model model
                            ) {
        Person saved = repository.save(person);
        model.addAttribute(saved);
        return "edit";
    }
}
