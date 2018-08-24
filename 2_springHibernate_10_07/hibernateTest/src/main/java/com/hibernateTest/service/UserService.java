package com.hibernateTest.service;

import com.hibernateTest.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> userList();

    List<User> userListWithModify();

    Map<User, String> userListWithCel();

    User getByName();
    User getBySurname();
}
