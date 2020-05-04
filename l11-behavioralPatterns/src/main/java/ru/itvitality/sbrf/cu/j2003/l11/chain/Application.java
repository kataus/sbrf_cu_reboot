package ru.itvitality.sbrf.cu.j2003.l11.chain;

import java.util.ArrayList;
import java.util.List;

class Application {
    private List<String> history = new ArrayList<>();

    void addHistoryRecord(String record) {
        history.add(record);
    }

    void printHistory() {
        System.out.println(history);
    }
}
