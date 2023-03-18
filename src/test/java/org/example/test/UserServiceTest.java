package org.example.test;

import org.example.model.User;
import org.example.model.UserDao;
import org.example.service.Impl.UserServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;
    public UserServiceTest() {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Возвращает true если пользователь в списке")
    public void trueReturner() {
        User user = new User("Olga");
        when(userDao.getUsersByName(user.getName())).thenReturn(user);
        assertTrue(userService.checkUserExist(user));
    }

    @Test
    @DisplayName("Возвращает false если пользователь в списке нет")
    public void falseReturner() {
        User user = new User("Maksim");
        when(userDao.getUsersByName(user.getName())).thenReturn(null);
        assertFalse(userService.checkUserExist(user));
    }
}
