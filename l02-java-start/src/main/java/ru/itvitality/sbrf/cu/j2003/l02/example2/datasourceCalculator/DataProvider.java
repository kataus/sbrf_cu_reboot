package ru.itvitality.sbrf.cu.j2003.l02.example2.datasourceCalculator;

public interface DataProvider {
    int getDataInteger();

    double getDataDouble( int seed );
}
