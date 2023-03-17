package org.example.service.Impl;
import org.example.model.Impl.UserDaoImpl;
import org.example.model.User;
import org.example.model.UserDao;
import org.example.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return user.equals(userDao.getUsersByName(user.getName()));
    }
}
