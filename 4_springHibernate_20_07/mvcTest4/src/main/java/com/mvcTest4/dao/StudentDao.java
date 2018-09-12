package com.mvcTest4.dao;

import com.mvcTest4.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> userList();

    List<Student> getAllUsers();

    Student studentByUsername(String name);

    Student getById(long TheId);

    void remove(Student student);

    void sdd(Student student);

    void update(Student student);

    void saveOrUpdate(Student student);

}






