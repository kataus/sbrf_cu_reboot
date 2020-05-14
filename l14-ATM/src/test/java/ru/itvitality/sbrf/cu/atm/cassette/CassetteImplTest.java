package ru.itvitality.sbrf.cu.atm.cassette;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itvitality.sbrf.cu.atm.exceptions.IncorectValue;
import ru.itvitality.sbrf.cu.atm.ref.Nominal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName(value = "Кассета должна ")
public class CassetteImplTest {
    private Cassette cassette;
    @BeforeEach
    public void prepareCassete(){
        cassette = new CassetteImpl( Nominal.ONE_HUND);
        cassette.add(5);
    }

    @Test
    @DisplayName(value = "принимать положительную сумму меняя баланс")
    public void add() {
        cassette.add(4);
        assertEquals(9, cassette.count());
    }

    @Test
    @DisplayName(value = "принимать 0 не меняя баланс")
    public void addZero() {
        cassette.add(0);
        assertEquals(5, cassette.count());
    }

    @Test
    @DisplayName(value = "не принимать отрицательное колличество купюр")
    public void addMinus() {
        assertThrows( IncorectValue.class, () -> {
            cassette.add(-1);
        });
    }

    @Test
    public void extract() {
    }

    @Test
    public void count() {
    }
}