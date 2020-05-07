package ru.itvitality.sbrf.cu.j2003.l12.proxy.lazy;

public class LazyProxy implements  HeavyObject{
  private final HeavyObject heavyObject;


  public LazyProxy(HeavyObject heavyObject) {
    this.heavyObject = heavyObject;
  }

  public String getValue() {
    if (!heavyObject.isInit()) {
      heavyObject.init("bigVal");
    }
    return heavyObject.getValue();
  }

  @Override
  public void init(String value) {
    heavyObject.init(value);
  }

  @Override
  public boolean isInit() {
    return heavyObject.isInit();
  }

}
