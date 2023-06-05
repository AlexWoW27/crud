package com.taskcomp.dao;

import com.taskcomp.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    void save(User user);

    void delete(int id);

    void update(int id, User updateUser);

    User show(int id);

}
