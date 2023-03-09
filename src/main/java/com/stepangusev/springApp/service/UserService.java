package com.stepangusev.springApp.service;

import com.stepangusev.springApp.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findById(Long id);
    void deleteById(Long id);
    void update(User user);
    List<User> listAllUsers();
}
