package ru.itvitality.sbrf.cu.j2003.l11.state;

public class OnState implements State {
    @Override
    public State action() {
        System.out.println("лампа светит");
        return StateProvider.getOffState();
    }
}
