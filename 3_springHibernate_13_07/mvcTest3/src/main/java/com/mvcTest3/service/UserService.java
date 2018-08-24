package com.mvcTest3.service;

import com.mvcTest3.entity.Student;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Student> userList();

    List<Student> userListId();

    List<Student> userListWithModify();

    Map<Student, String> userListWithCel();

    Student getById();

    void addStudent(Student student);
}
