package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.updated;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.AbstractFactory;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.led.LedFactory;

/**
 * Лампочка.
 *
 * @author sergey
 * created on 17.09.18.
 */
public class LedStrategy implements Strategy {
    @Override
    public AbstractFactory configuration() {
        return new LedFactory();
    }
}
