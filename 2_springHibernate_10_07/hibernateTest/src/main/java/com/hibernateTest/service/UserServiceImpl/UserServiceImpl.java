package com.hibernateTest.service.UserServiceImpl;

import com.hibernateTest.dao.UserDao;
import com.hibernateTest.entity.User;
import com.hibernateTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
//    @Qualifier(value = "userMethodForDb")
    private UserDao userDao;

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Override
    public List<User> userListWithModify() {
        List <User> userList = userDao.userList();
        for (User user : userList) {
            user.setName(user.getName()+ " -word");
        }
        return userList;
    }

    @Override
    public Map<User, String> userListWithCel() {
        List <User> userList = userDao.userList();
        Map<User,String> userSalary = new HashMap<>();
        for (int i = 0; i < userList.size(); i++){
            userSalary.put(userList.get(i), String.valueOf(i + 100));
        }
        return userSalary;
    }

    @Override
    public User getByName() {
        return null;
    }

    @Override
    public User getBySurname() {
        return null;
    }
}
