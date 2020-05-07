package ru.itvitality.sbrf.cu.j2003.l12.facade;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class Demo {
  public static void main(String[] args) {
    HellSystemA systemA = new HellSystemA();
    HellSystemB systemB = new HellSystemB();

    Facade facade = new Facade(systemA, systemB);
    facade.simpleAction();
  }
}
