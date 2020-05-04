package ru.itvitality.sbrf.cu.j2003.l11.state;

class BulbContext {

    private State state = StateProvider.getOffState();

    void performAction() {
        this.setState(state.action());
    }

    void setState(State state) {
        this.state = state;
    }
}
