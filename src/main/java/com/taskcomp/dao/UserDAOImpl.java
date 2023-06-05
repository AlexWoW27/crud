package com.taskcomp.dao;

import com.taskcomp.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Transactional
    @Override
    public void save(User user) {
        User user1 = new User();
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setAge(user.getAge());
        entityManager.persist(user1);
    }

    @Transactional
    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Transactional
    @Override
    public void update(int id,User updateUser) {
        User user = entityManager.find(User.class, id);
        user.setName(updateUser.getName());
        user.setSurname(updateUser.getSurname());
        user.setAge(updateUser.getAge());
        entityManager.merge(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User show(int id) {
        User user = entityManager.find(User.class,id);
        entityManager.detach(user);
        return user;
    }

}
