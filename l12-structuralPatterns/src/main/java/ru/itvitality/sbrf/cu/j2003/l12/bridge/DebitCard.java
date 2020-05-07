package ru.itvitality.sbrf.cu.j2003.l12.bridge;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class DebitCard extends Card {
  public DebitCard(PaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  protected void cardType() {
    System.out.println("debit card");
  }
}
