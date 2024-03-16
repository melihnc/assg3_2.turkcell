package org.example.dataAccess;

import org.example.entities.User;

public interface UserRepository {
    void addToDb (User user);
    void updateToDb(User user);
    void deleteFromDb(User user);
    void getFromDatabase(User user);
}
