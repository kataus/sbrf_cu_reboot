package ru.itvitality.sbrf.cu.atm.dto;


import lombok.Data;
import ru.itvitality.sbrf.cu.atm.ref.Nominal;

@Data
public class CashPair {
    private final Nominal nominal;
    private final int count;
}
