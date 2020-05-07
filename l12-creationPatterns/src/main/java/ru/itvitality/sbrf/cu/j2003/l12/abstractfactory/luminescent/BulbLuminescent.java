package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.luminescent;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Bulb;

/**
 * @author sergey
 * created on 17.09.18.
 */
public class BulbLuminescent implements Bulb {
  @Override
  public void light() {
    System.out.println("Luminescent light");
  }
}
