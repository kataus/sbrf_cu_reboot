package ru.itvitality.sbrf.cu.j2003.l10.polymorphism;

import ru.itvitality.sbrf.cu.j2003.l10.polymorphism.operations.Create;
import ru.itvitality.sbrf.cu.j2003.l10.polymorphism.operations.Update;

/**
 * @author sergey
 * created on 09.09.19.
 */
public class PolyBad {
  public static void main(String[] args) {
    new PolyBad().go("BAD1", "create");
    new PolyBad().go("BAD2", "update");
    // Как добавить select?
  }

  private void go(String data, String command) {
    switch (command) {
      case "create":
        new Create().action(data);
        break;
      case "update":
        new Update().action(data);
        break;
      default:
        throw new IllegalArgumentException("Unknown command:" + command);
    }
  }


}
