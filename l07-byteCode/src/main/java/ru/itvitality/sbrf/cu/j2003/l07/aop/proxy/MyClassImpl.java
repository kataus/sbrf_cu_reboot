package ru.itvitality.sbrf.cu.j2003.l07.aop.proxy;


public class MyClassImpl implements MyClassInterface {

  @Override
  public void secureAccess(String param) {
    System.out.println("secureAccess, param:" + param);
  }

  @Override
  public String toString() {
    return "MyClassImpl{}";
  }
}
