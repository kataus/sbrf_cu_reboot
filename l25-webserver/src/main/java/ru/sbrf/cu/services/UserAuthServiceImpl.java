package ru.sbrf.cu.services;

import ru.sbrf.cu.dao.UserDao;

public class UserAuthServiceImpl implements UserAuthService {

    private final UserDao userDao;

    public UserAuthServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean authenticate(String login, String password) {
        return userDao.findByLogin(login)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }

}
