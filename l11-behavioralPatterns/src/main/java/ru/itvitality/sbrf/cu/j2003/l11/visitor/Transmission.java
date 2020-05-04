package ru.itvitality.sbrf.cu.j2003.l11.visitor;

public class Transmission implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    String refreshOil() {
        return "Заменить масло";
    }
}
