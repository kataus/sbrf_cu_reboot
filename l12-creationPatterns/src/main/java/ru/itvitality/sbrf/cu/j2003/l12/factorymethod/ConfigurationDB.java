package ru.itvitality.sbrf.cu.j2003.l12.factorymethod;

/**
 * @author sergey
 * created on 19.09.18.
 */
public class ConfigurationDB implements Configuration {
  @Override
  public String params() {
    return "params from DB";
  }
}
