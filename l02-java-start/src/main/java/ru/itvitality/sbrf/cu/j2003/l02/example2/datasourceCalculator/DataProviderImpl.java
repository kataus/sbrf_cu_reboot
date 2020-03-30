package ru.itvitality.sbrf.cu.j2003.l02.example2.datasourceCalculator;

public class DataProviderImpl extends AbstractDataProvider {

    private int intSource = 0;

    @Override
    public int getDataInteger() {
        return intSource++;
    }


}
