package ru.itvitality.sbrf.cu.j2003.l11.memento;

class Memento {
    private final State state;

    Memento(State state) {
        this.state = new State(state);
    }

    State getState() {
        return state;
    }
}
