package ru.Boot.CRUDForBoot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.Boot.CRUDForBoot.dao.UserDAO;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }
    @Override
    public User show(int id) {
        return userDAO.show(id);
    }
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
    @Override
    public void update( User updateUser) {
        userDAO.update( updateUser);
    }
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
