package ru.itvitality.sbrf.cu.j2003.l16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.itvitality.sbrf.cu.j2003.l16.core.model.User;
import ru.itvitality.sbrf.cu.j2003.l16.core.service.DBServiceUser;
import ru.itvitality.sbrf.cu.j2003.l16.core.service.DbServiceUserImpl;
import ru.itvitality.sbrf.cu.j2003.l16.jdbc.dao.UserDaoJdbc;
import ru.itvitality.sbrf.cu.j2003.l16.jdbc.sessionmanager.SessionManagerJdbc;
import ru.itvitality.sbrf.cu.j2003.l16.core.dao.UserDao;
import ru.itvitality.sbrf.cu.j2003.l16.jdbc.DbExecutor;
import ru.itvitality.sbrf.cu.j2003.l16.h2.DataSourceH2;

public class DbServiceDemo {
  private static Logger logger = LoggerFactory.getLogger(DbServiceDemo.class);

  public static void main(String[] args) throws Exception {
    DataSource dataSource = new DataSourceH2();
    DbServiceDemo demo = new DbServiceDemo();

    demo.createTable(dataSource);

    SessionManagerJdbc sessionManager = new SessionManagerJdbc(dataSource);
    DbExecutor<User> dbExecutor = new DbExecutor<>();
    UserDao userDao = new UserDaoJdbc(sessionManager, dbExecutor);

    DBServiceUser dbServiceUser = new DbServiceUserImpl(userDao);
    long id = dbServiceUser.saveUser(new User(0, "dbServiceUser"));
    Optional<User> user = dbServiceUser.getUser(id);

    System.out.println(user);
    user.ifPresentOrElse(
        crUser -> logger.info("created user, name:{}", crUser.getName()),
        () -> logger.info("user was not created")
    );

  }

  private void createTable(DataSource dataSource) throws SQLException {
    try (Connection connection = dataSource.getConnection();
         PreparedStatement pst = connection.prepareStatement("create table user(id long auto_increment, name varchar(50))")) {
      pst.executeUpdate();
    }
    System.out.println("table created");
  }
}
