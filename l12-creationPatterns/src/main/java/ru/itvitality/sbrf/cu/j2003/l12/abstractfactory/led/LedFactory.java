package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.led;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.AbstractFactory;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Bulb;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Lampholder;

/**
 * @author sergey
 * created on 17.09.18.
 */
public class LedFactory implements AbstractFactory {
  @Override
  public Bulb createBulb() {
    return new BulbLed();
  }

  @Override
  public Lampholder createLampholder() {
    return new LampholderLed();
  }
}
