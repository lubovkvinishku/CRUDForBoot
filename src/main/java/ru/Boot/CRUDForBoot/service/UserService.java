package ru.Boot.CRUDForBoot.service;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;

public interface UserService {

    public List<User> allUsers();
    public User show(int id);
    public void save(User user);
    public void update(User updateUser);
    public void delete(int id);
}




