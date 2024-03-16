package org.example.dataAccess;

import org.example.entities.User;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public void addToDb(User user) {
        System.out.println("***Veri tabanına eklendi.");
    }

    @Override
    public void updateToDb(User user) {
        System.out.println("***Veri tabanında guncellendi.");
    }

    @Override
    public void deleteFromDb(User user) {
        System.out.println("***Veri tabanından silindi.");
    }

    @Override
    public void getFromDatabase(User user) {
        System.out.println(user.getEmail());
    }
}
