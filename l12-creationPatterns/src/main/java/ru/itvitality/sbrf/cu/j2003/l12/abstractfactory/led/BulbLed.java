package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.led;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Bulb;

/**
 * @author sergey
 * created on 18.09.18.
 */
public class BulbLed implements Bulb {
  @Override
  public void light() {
    System.out.println("Led light");
  }
}
