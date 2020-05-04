package ru.itvitality.sbrf.cu.j2003.l11.visitor;

public interface Visitor {
    void visit(Engine item);

    void visit(Transmission item);

    void visit(Brake item);
}
