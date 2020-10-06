package com.cyp.dao;

import com.cyp.domain.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);
    int removeUserById(int id);
    int updateUser(User user);
    User findUserById(int id);
    List<User> list();
}
