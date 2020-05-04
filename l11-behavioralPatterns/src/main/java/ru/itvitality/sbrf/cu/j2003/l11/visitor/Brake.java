package ru.itvitality.sbrf.cu.j2003.l11.visitor;

public class Brake implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    String replaceBrakePad() {
        return "Заменить тормозные колодки";
    }
}
