package com.mvcTest4.service;

import com.mvcTest4.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> userList();

    List<Student> userListWithModify();

    Map<Student, String> userListWithCel();


    Student getById();

    void addStudent(Student student);
}
