package org.example.model;
import java.awt.*;
import java.util.List;

public interface UserDao {
    User getUsersByName(String name);
    List<User> getAllUsers();
}
