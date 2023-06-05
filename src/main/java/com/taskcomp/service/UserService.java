package com.taskcomp.service;

import com.taskcomp.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void save(User user);

    void delete(Long id);

    void update(Long id, User updateUser);

    User show(Long id);
}
