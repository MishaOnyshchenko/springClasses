package com.hibernateTest.dao;

import com.hibernateTest.entity.User;

import java.util.List;

public interface UserDao {

    List<User> userList();

    User getByName();
    User getBySurname();

}
