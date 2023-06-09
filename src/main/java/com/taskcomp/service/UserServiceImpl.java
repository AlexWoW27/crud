package com.taskcomp.service;

import com.taskcomp.dao.UserDao;
import com.taskcomp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDAO;

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public void update(Long id, User updateUser) {
        userDAO.update(id, updateUser);
    }

    @Transactional(readOnly = true)
    @Override
    public User show(Long id) {
        return userDAO.show(id);
    }

}
