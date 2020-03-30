package ru.itvitality.sbrf.cu.j2003.l02.example2.datasourceCalculator;

public abstract class AbstractDataProvider implements DataProvider {
    @Override
    public abstract int getDataInteger() ;

    @Override
    public double getDataDouble( int seed ) {
        throw new RuntimeException( "service is not available" );
    }
}
