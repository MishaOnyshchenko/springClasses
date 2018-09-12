package com.mvcTest5.service;

import com.mvcTest5.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> userList();

    List<Student> userListWithModify();

    Map<Student, String> userListWithCel();


    Student getById();

}
