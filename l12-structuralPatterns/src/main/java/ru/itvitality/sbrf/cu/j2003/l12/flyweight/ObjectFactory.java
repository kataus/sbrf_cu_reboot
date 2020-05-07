package ru.itvitality.sbrf.cu.j2003.l12.flyweight;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class ObjectFactory {
  private final HeavyCommonPart heavyCommonPart;

  public ObjectFactory() {
    heavyCommonPart = new HeavyCommonPart();
  }

  public ObjectOnLine create(int x) {
    return new ObjectOnLine(heavyCommonPart, x);
  }
}
