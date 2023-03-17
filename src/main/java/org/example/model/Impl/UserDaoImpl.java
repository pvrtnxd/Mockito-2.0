package org.example.model.Impl;

import org.example.model.User;
import org.example.model.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> users = new ArrayList<>();
    public UserDaoImpl() {
        users.add(new User("Anna"));
        users.add(new User("Anton"));
    }

    @Override
    public User getUsersByName (String name) {
        User user = users.stream()
                .filter(e -> name.equals(e.getName()))
                .findAny().orElse(null);
        return user;

    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

}

