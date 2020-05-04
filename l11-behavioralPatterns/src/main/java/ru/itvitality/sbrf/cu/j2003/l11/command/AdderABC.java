package ru.itvitality.sbrf.cu.j2003.l11.command;

public class AdderABC implements Command {
    @Override
    public String execute(String data) {
        return data + "ABC";
    }
}
