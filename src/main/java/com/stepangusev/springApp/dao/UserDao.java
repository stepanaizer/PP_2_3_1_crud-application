package com.stepangusev.springApp.dao;

import com.stepangusev.springApp.model.User;

import java.util.List;


public interface UserDao {
    void addUser(User user);
    User findUserById(Long id);
    void deleteUserById(Long id);
    void updateUser(User user);
    List<User> listAllUsers();
}
