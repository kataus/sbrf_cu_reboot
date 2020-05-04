package ru.itvitality.sbrf.cu.j2003.l11.chain;

public class ApplicationInput extends ApplProcessor {

    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление принято");
    }

    @Override
    public String getProcessorName() {
        return "Прием заявления";
    }
}
