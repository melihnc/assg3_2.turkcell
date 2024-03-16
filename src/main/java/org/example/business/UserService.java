package org.example.business;

import org.example.entities.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    void getUser(User user);
}
