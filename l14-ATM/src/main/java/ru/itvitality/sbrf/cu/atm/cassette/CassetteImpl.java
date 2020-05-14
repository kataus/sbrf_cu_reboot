package ru.itvitality.sbrf.cu.atm.cassette;

import lombok.Getter;
import ru.itvitality.sbrf.cu.atm.exceptions.IncorectValue;
import ru.itvitality.sbrf.cu.atm.exceptions.NoAvailableRequestCount;
import ru.itvitality.sbrf.cu.atm.ref.Nominal;

@Getter
public class CassetteImpl implements Cassette {
    private final Nominal nominal;
    private Integer count;

    public CassetteImpl( Nominal nominal ) {
        this.nominal = nominal;
        this.count = 0;
    }

    @Override
    public void add( int count ) {
        if ( count < 0 ) throw new IncorectValue();
        this.count += count;
    }

    @Override
    public void extract( int count ) {
        if ( this.count - count < 0 ) throw new NoAvailableRequestCount();
        this.count -= count;
    }

    @Override
    public int count() {
        return count;
    }
}
