package com.mvcTest5.dao;

import com.mvcTest5.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> userList();

    List<Student> getAllUserWithNameAndPintOnly();

    Student UserByUsername(String name);

    Student getById(long id);

    void remove(Student student);

    void  add(Student student);

    void update(Student student);

    void saveOrUpdate(Student entity);
}






