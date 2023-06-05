package com.taskcomp.service;

import com.taskcomp.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void save(User user);

    void delete(int id);

    void update(int id, User updateUser);

    User show(int id);
}
