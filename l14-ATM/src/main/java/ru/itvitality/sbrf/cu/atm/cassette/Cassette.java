package ru.itvitality.sbrf.cu.atm.cassette;

import ru.itvitality.sbrf.cu.atm.ref.Nominal;

public interface Cassette {
    void add(int count);
    void extract(int count);
    int count();
    Nominal getNominal();
}
