package ru.Boot.CRUDForBoot.dao;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.Boot.CRUDForBoot.model.User;
import java.util.List;


@Repository
@Transactional
@Component
public class UserDAOImpl implements UserDAO{
    @PersistenceContext //для автоматического связывания менеджера сущностей с бином
    private EntityManager entityManager;



    public List<User> allUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user){
        entityManager.persist(user);
    }

    public void update(User updateUser) {
        entityManager.merge(updateUser);
    }
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
