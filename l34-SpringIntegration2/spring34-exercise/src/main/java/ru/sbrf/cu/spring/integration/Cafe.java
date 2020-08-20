package ru.sbrf.cu.spring.integration;


import ru.sbrf.cu.spring.integration.domain.Food;
import ru.sbrf.cu.spring.integration.domain.OrderItem;

// TODO: add messaging gateway annotation
public interface Cafe {

    // TODO: add gateway annotation with required channels
    Food process(OrderItem orderItem);
}
