package com.taskcomp.service;

import com.taskcomp.dao.UserDAO;
import com.taskcomp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    public void update(int id, User updateUser) {
        userDAO.update(id, updateUser);
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

}
