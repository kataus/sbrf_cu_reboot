package ru.itvitality.sbrf.cu.j2003.l11.chain;

public class ApplicationResult extends ApplProcessor {

    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Результат выдан");
    }

    @Override
    public String getProcessorName() {
        return "Выдача результата";
    }
}
