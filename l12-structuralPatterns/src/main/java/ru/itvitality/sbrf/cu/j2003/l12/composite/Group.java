package ru.itvitality.sbrf.cu.j2003.l12.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class Group implements Unit {
  private final List<Unit> units = new ArrayList<>();

  public void addUnit(Unit unit) {
    units.add(unit);
  }

  @Override
  public void move() {
    units.forEach(Unit::move);
  }
}
