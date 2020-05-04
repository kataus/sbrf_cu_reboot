package ru.itvitality.sbrf.cu.j2003.l11.strategy;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Bus());
        context.applyStrategy();

        context.setStrategy(new Car());
        context.applyStrategy();

        context.setStrategy(new Taxi());
        context.applyStrategy();

        context.setStrategy(() -> System.out.println("Долетель на ракете"));
        context.applyStrategy();

    }

}
