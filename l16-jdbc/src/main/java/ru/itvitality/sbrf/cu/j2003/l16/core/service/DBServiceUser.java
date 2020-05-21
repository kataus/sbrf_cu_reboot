package ru.itvitality.sbrf.cu.j2003.l16.core.service;

import ru.itvitality.sbrf.cu.j2003.l16.core.model.User;

import java.util.Optional;

public interface DBServiceUser {

  long saveUser(User user);

  Optional<User> getUser(long id);

}
