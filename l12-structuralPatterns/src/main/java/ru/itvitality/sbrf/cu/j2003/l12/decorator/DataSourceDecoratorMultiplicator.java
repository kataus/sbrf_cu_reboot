package ru.itvitality.sbrf.cu.j2003.l12.decorator;

/**
 * @author sergey
 * created on 16.01.19.
 */
public class DataSourceDecoratorMultiplicator implements DataSource {
  private final DataSource dataSource;

  public DataSourceDecoratorMultiplicator(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public int getInteger() {
    return dataSource.getInteger() * 2;
  }
}
