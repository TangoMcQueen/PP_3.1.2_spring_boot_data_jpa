package ru.ez.spring.boot.datajpa.service;


import ru.ez.spring.boot.datajpa.model.User;

import java.util.List;

public interface UserService {
    List<User> listAllUsers();
    public void saveOrUpdateUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}
