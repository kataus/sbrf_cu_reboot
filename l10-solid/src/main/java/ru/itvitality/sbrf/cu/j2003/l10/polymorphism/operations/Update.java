package ru.itvitality.sbrf.cu.j2003.l10.polymorphism.operations;

import ru.itvitality.sbrf.cu.j2003.l10.polymorphism.Operation;

/**
 * @author sergey
 * created on 09.09.19.
 */
public class Update implements Operation {
  @Override
  public void action(String data) {
    System.out.println("update, data:" + data);
  }
}
