package ru.itvitality.sbrf.cu.j2003.l11.state;

public class StateProvider {
    private static final State onState = new OnState();
    private static final State offState = new OffState();

    public static State getOnState() {
        return onState;
    }

    public static State getOffState() {
        return offState;
    }
}
