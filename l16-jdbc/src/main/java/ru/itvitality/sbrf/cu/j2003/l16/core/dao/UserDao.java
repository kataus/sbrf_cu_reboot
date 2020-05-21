package ru.itvitality.sbrf.cu.j2003.l16.core.dao;

import java.util.Optional;

import ru.itvitality.sbrf.cu.j2003.l16.core.model.User;
import ru.itvitality.sbrf.cu.j2003.l16.core.sessionmanager.SessionManager;

public interface UserDao {
  Optional<User> findById(long id);

  long saveUser(User user);

  SessionManager getSessionManager();
}
