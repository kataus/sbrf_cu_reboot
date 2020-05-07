package ru.itvitality.sbrf.cu.j2003.l11.observer;

import java.util.ArrayList;
import java.util.List;


class EventProducer implements Producer {

    private final List<Listener> listeners = new ArrayList<>();

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    void event(String data) {
        listeners.forEach(listener -> listener.onUpdate(data));
    }
}
