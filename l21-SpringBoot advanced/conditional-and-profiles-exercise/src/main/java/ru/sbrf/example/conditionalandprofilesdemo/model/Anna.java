package ru.sbrf.example.conditionalandprofilesdemo.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import ru.sbrf.example.conditionalandprofilesdemo.model.base.Friend;

@ConditionalOnBean(Alexey.class)
@Component
public class Anna extends Friend {
    @Override
    public String getName() {
        return "Аня";
    }
}
