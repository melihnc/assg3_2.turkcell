package org.example.business;

import org.example.dataAccess.UserRepository;
import org.example.entities.User;
import org.example.logging.BaseLogger;

public class UserServiceImpl implements UserService{
    //private User[] users; //tekrar bakilacak...
    UserRepository repository;
    BaseLogger logger;

    public UserServiceImpl(BaseLogger logger, UserRepository repository) {
        this.logger = logger;
        this.repository = repository;

    }

    @Override
    public void addUser(User user) {
        logger.logMessage("Veritabanına ekleniyor..");
        repository.addToDb(user);
    }

    @Override
    public void updateUser(User user) {
        logger.logMessage("Veritabanında guncelleniyor..");
        repository.updateToDb(user);
    }

    @Override
    public void deleteUser(User user) {
        logger.logMessage("Veritabanından siliniyor..");
        repository.deleteFromDb(user);
    }

    @Override
    public void getUser(User user) {
        logger.logMessage("Kullanıcı bilgisi getiriliyor..");
        repository.getFromDatabase(user);
    }
}
