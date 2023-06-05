package com.taskcomp.dao;

import com.taskcomp.models.User;

import java.util.List;

public interface userDAO {

    List<User> getUsers();
    void add(User user);
    void delete(User user);
    User changeUser(User user);
    User getUser(Long id);
}
