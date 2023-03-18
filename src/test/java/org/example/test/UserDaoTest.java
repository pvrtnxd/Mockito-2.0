package org.example.test;

import org.example.model.Impl.UserDaoImpl;
import org.example.model.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    private final UserDaoImpl userDao = new UserDaoImpl();

    private static final List<User> newUsers = List.of(
            new User("Anna"),
            new User("Anton"));

    @Test
    @DisplayName("Возвращает пользователя из списка")
    public void returner() {
        User user = new User("Anna");
        Assertions.assertEquals(user, userDao.getUsersByName(user.getName()));
    }

    @Test
    @DisplayName("Возвращает null, если имени нет в списке")
    public void nullReturner() {
        User user = new User("Lion");
        Assertions.assertNull(userDao.getUsersByName(user.getName()));
    }

    @Test
    @DisplayName("Список всех пользователей")
    public void getUsersList () {
        assertEquals(newUsers, userDao.getAllUsers());
    }
}
