package ru.Boot.CRUDForBoot.dao;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;

public interface UserDAO {

    public List<User> index();
    public User show(int id);
    public void save(User user);
    public void update(User updateUser);
    public void delete(int id);
}

//    public List<Customer> index();
//    public Customer show(long id);
//    public void save(Customer customer);
//    public void update(Customer customer);
//    public void delete(long id);
