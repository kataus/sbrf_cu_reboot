package ru.sbrf.example.conditionalandprofilesdemo.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.sbrf.example.conditionalandprofilesdemo.model.base.Friend;

@Profile("Peter")
@Component
public class Peter extends Friend {

    @Override
    public String getName() {
        return "Петр";
    }
}
