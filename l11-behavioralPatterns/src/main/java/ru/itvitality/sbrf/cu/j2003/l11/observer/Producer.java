package ru.itvitality.sbrf.cu.j2003.l11.observer;

public interface Producer {
    void addListener(Listener listener);

    void removeListener(Listener listener);
}
