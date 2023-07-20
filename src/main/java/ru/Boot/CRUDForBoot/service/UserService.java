package ru.Boot.CRUDForBoot.service;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;

public interface UserService {

    public List<User> index();
    public User show(int id);
    public void save(User user);
    public void update(User updateUser);
    public void delete(int id);
}




