package ru.itvitality.sbrf.cu.j2003.l12.bridge;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class CreditCard extends Card {
  public CreditCard(PaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  protected void cardType() {
    System.out.println("credit card");
  }
}
