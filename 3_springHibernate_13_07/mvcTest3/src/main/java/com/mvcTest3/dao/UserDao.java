package com.mvcTest3.dao;

import com.mvcTest3.entity.Student;

import java.util.List;

public interface UserDao {

    List<Student> userList();

    void sddStudent (Student student);

    Student getById(long TheId);

}
