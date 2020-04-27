package ru.itvitality.sbrf.cu.j2003.l10.polymorphism.operations;

import ru.itvitality.sbrf.cu.j2003.l10.polymorphism.Operation;

/**
 * @author sergey
 * created on 09.09.19.
 */
public class Create implements Operation {
  @Override
  public void action(String data) {
    System.out.println("create, data:" + data);
  }
}
