package ru.sbrf.example.conditionalandprofilesdemo.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.sbrf.example.conditionalandprofilesdemo.model.base.Friend;

@Profile("Oleg")
@Component
public class Oleg extends Friend {
    @Override
    public String getName() {
        return "Олег";
    }
}
