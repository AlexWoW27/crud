package com.taskcomp.service;

import com.taskcomp.models.User;

import java.util.List;

public interface userService {

    List<User> getUsers();
    void add(User user);
    void delete(User user);
    User changeUser(User user);
    User getUser(Long id);
}
