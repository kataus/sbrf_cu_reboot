package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.luminescent;

import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.AbstractFactory;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Bulb;
import ru.itvitality.sbrf.cu.j2003.l12.abstractfactory.Lampholder;

/**
 * @author sergey
 * created on 17.09.18.
 */
public class LuminescentFactory implements AbstractFactory {
  @Override
  public Bulb createBulb() {
    return new BulbLuminescent();
  }

  @Override
  public Lampholder createLampholder() {
    return new LampholderLuminescent();
  }
}
