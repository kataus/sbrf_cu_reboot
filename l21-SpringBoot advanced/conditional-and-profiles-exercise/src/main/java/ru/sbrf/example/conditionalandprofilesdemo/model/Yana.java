package ru.sbrf.example.conditionalandprofilesdemo.model;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import ru.sbrf.example.conditionalandprofilesdemo.model.base.Friend;
import ru.sbrf.example.conditionalandprofilesdemo.model.conditions.YanaConditions;


@Conditional(YanaConditions.class)
@Component
public class Yana extends Friend {
    @Override
    public String getName() {
        return "Яна";
    }
}
