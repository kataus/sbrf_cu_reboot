package ru.itvitality.sbrf.cu.j2003.l12.abstractfactory;

/**
 * @author sergey
 * created on 17.09.18.
 */
public interface AbstractFactory {
  Bulb createBulb();

  Lampholder createLampholder();
}
