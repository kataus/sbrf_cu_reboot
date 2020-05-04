package ru.itvitality.sbrf.cu.j2003.l11.command;

public class Echo implements Command {
    @Override
    public String execute(String data) {
        return data;
    }
}
