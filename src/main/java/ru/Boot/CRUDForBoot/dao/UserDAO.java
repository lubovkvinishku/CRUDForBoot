package ru.Boot.CRUDForBoot.dao;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;

public interface UserDAO {

    public List<User> allUsers();
    public User show(int id);
    public void save(User user);
    public void update(User updateUser);
    public void delete(int id);
}


