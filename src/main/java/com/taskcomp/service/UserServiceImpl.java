package com.taskcomp.service;

import com.taskcomp.dao.userDAO;
import com.taskcomp.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userServiceImpl implements userService{

    private userDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public User changeUser(User user) {
        return userDAO.changeUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }


}
