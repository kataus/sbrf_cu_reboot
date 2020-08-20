package ru.sbrf.cu.spring.integration;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import ru.sbrf.cu.spring.integration.domain.Food;
import ru.sbrf.cu.spring.integration.domain.OrderItem;

import java.util.Collection;

@MessagingGateway
public interface Cafe {

    @Gateway(requestChannel = "itemsChannel", replyChannel = "foodChannel")
    Collection<Food> process( Collection<OrderItem> orderItem);
}
