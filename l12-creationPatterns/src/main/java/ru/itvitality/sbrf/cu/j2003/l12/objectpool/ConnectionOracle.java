package ru.itvitality.sbrf.cu.j2003.l12.objectpool;

/**
 * @author sergey
 * created on 19.09.18.
 */
public class ConnectionOracle implements Connection {
  @Override
  public void connect() {
    System.out.println("connection to Oracle");
  }

  @Override
  public void select() {
    System.out.println("select from Oracle");
  }
}
