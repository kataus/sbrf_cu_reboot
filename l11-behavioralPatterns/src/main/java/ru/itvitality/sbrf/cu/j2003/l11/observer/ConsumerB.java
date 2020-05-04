package ru.itvitality.sbrf.cu.j2003.l11.observer;

public class ConsumerB {

    /*
     * Большой и жирный класс со множеством полей
     *
     */
    private final Listener listener = data -> System.out.println("ConsumerB data:" + data);

    public Listener getListener() {
        return listener;
    }
}
