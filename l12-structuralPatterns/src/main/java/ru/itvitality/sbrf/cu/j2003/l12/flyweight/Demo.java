package ru.itvitality.sbrf.cu.j2003.l12.flyweight;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class Demo {
  public static void main(String[] args) {
    ObjectFactory objectFactory = new ObjectFactory();

    ObjectOnLine object1 = objectFactory.create(1);
    System.out.println(object1.toString());

    ObjectOnLine object2 = objectFactory.create(2);
    System.out.println(object2.toString());

    ObjectOnLine object3 = objectFactory.create(3);
    System.out.println(object3.toString());
  }
}
