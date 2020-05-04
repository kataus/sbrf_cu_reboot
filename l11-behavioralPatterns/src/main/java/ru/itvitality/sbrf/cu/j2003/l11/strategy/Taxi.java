package ru.itvitality.sbrf.cu.j2003.l11.strategy;

public class Taxi implements Strategy {
    @Override
    public void transportation() {
        System.out.println("доехать на такси");
    }
}
