package ru.itvitality.sbrf.cu.j2003.l12.bridge;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class VisaPS implements PaymentSystem {
  @Override
  public void printName() {
    System.out.println("VisaPS");
  }
}
