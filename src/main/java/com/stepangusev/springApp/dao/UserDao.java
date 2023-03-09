package com.stepangusev.springApp.dao;

import com.stepangusev.springApp.model.User;

import java.util.List;


public interface UserDao {
    void save(User user);
    User findById(Long id);
    void deleteById(Long id);
    void update(User user);
    List<User> listAllUsers();
}
