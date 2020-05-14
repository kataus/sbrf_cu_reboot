package ru.itvitality.sbrf.cu.atm;

import ru.itvitality.sbrf.cu.atm.ref.Nominal;

import java.util.List;

public interface ATM {
    int add(List<Nominal> pack);

    List<Nominal> get(int summ);
}
