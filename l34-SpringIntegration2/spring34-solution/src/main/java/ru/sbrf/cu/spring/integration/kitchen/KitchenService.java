package ru.sbrf.cu.spring.integration.kitchen;

import org.springframework.stereotype.Service;
import ru.sbrf.cu.spring.integration.domain.Food;
import ru.sbrf.cu.spring.integration.domain.OrderItem;

@Service
public class KitchenService {

    public Food cook( OrderItem orderItem) throws Exception {
        System.out.println("Cooking " + orderItem.getItemName());
        Thread.sleep(3000);
        System.out.println("Cooking " + orderItem.getItemName() + " done");
        return new Food(orderItem.getItemName());
    }
}
