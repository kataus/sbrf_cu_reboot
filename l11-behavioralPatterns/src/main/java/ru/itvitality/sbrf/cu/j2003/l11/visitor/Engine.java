package ru.itvitality.sbrf.cu.j2003.l11.visitor;

public class Engine implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    String checkEngine() {
        return "Engine Ok";
    }
}
