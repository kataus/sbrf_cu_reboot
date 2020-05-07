package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.luminescent;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Lampholder;

/**
 * @author sergey
 * created on 18.09.18.
 */
public class LampholderLuminescent implements Lampholder {
  @Override
  public void hold() {
    System.out.println("Luminescent light");
  }
}
