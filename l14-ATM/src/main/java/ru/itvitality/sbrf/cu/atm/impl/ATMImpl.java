package ru.itvitality.sbrf.cu.atm.impl;

import ru.itvitality.sbrf.cu.atm.ATM;
import ru.itvitality.sbrf.cu.atm.CashMashine;
import ru.itvitality.sbrf.cu.atm.cassette.Cassette;
import ru.itvitality.sbrf.cu.atm.cassette.CassetteImpl;
import ru.itvitality.sbrf.cu.atm.dto.CashPair;
import ru.itvitality.sbrf.cu.atm.ref.Nominal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//TODO ATM + тесты
public class ATMImpl implements ATM, CashMashine {
    private List<Cassette> cassettes;

    //TODO конструктор или билдер создающий внутренную структуру ячеек


    public ATMImpl() {
        cassettes = new ArrayList<>();
        for ( var nominal : Nominal.values() ) {
            cassettes.add( new CassetteImpl( nominal ) );
        }
    }

    @Override
    public int add( List<Nominal> pack ) {
        return 0;
    }

    @Override
    public List<Nominal> get( int summ ) {
        return null;
    }

    @Override
    public List<CashPair> balance() {
        return
                cassettes.stream()
                        .map( cassette -> new CashPair( cassette.getNominal(), cassette.count() ) )
                        .collect( Collectors.toList() );
    }


}
