package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.updated;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.luminescent.LuminescentFactory;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.AbstractFactory;

/**
 * @author sergey
 * created on 18.09.18.
 */
public class LuminescentStrategy implements Strategy {
    @Override
    public AbstractFactory configuration() {
        return new LuminescentFactory();
    }
}
