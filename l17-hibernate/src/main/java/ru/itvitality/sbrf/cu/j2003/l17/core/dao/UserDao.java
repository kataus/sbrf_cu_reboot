package ru.itvitality.sbrf.cu.j2003.l17.core.dao;

import ru.itvitality.sbrf.cu.j2003.l17.core.model.User;
import ru.itvitality.sbrf.cu.j2003.l17.core.sessionmanager.SessionManager;

import java.util.Optional;

public interface UserDao {
  Optional<User> findById(long id);

  long saveUser(User user);

  SessionManager getSessionManager();
}
