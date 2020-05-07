package ru.itvitality.sbrf.cu.j2003.l12.objectpool;

/**
 * @author sergey
 * created on 19.09.18.
 */
class ConnectionFactory {
  Connection create() {
    return new ConnectionOracle();
  }
}
