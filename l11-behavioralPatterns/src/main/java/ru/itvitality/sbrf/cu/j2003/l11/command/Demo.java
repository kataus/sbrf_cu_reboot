package ru.itvitality.sbrf.cu.j2003.l11.command;

public class Demo {
    public static void main(String[] args) {
        Executor executor = new Executor();

        executor.addCommand(new AdderABC());
        executor.addCommand(new Echo());
        executor.addCommand(new AdderABC());

        executor.addCommand(String::toUpperCase);

        executor.executeCommands();
    }
}
