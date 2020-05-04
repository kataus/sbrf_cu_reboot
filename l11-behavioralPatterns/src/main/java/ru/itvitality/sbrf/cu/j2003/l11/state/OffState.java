package ru.itvitality.sbrf.cu.j2003.l11.state;

public class OffState implements State {
    @Override
    public State action() {
        System.out.println("темно");
        return StateProvider.getOnState();
    }
}
