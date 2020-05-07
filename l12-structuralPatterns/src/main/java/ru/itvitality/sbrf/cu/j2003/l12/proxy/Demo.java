package ru.itvitality.sbrf.cu.j2003.l12.proxy;

import ru.itvitality.sbrf.cu.j2003.l12.proxy.lazy.HeavyObject;
import ru.itvitality.sbrf.cu.j2003.l12.proxy.lazy.HeavyObjectImpl;
import ru.itvitality.sbrf.cu.j2003.l12.proxy.lazy.LazyProxy;
import ru.itvitality.sbrf.cu.j2003.l12.proxy.security.SecurityAccess;
import ru.itvitality.sbrf.cu.j2003.l12.proxy.security.SecurityAccessImpl;
import ru.itvitality.sbrf.cu.j2003.l12.proxy.security.SecurityProxy;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class Demo {
  public static void main(String[] args) {
  //  security();
    lazy();
  }

  private static void security() {
    SecurityAccess proxy = new SecurityProxy(new SecurityAccessImpl());
    proxy.access();
  }

  private static void lazy() {
    HeavyObject heavyObject = new HeavyObjectImpl();
    System.out.println(heavyObject);

    HeavyObject heavyObjectProxy = new LazyProxy(heavyObject);

    String.valueOf(true).length();

    System.out.println(heavyObjectProxy.getValue());
    System.out.println(heavyObject);
    System.out.println(heavyObjectProxy.getValue());
  }
}
