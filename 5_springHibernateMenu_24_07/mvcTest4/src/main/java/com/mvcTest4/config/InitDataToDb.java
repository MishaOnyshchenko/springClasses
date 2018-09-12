package com.mvcTest4.config;


import com.mvcTest4.dao.StudentDao;
import com.mvcTest4.entity.Student;
import com.mvcTest4.entity.StudentTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitDataToDb {

    @Autowired
    private StudentDao studentDao;

    @PostConstruct
    private void init(){

        Student student = new Student();
        student.setPhone("12345");
        student.setName("Ivan");

        List<StudentTask> studentTaskList = new ArrayList<>();

        StudentTask studentTask1 = new StudentTask ("paint hairs in red", student);
        StudentTask studentTask2 = new StudentTask ("give him an apple", student);
        StudentTask studentTask3 = new StudentTask ("send him to home", student);
//        StudentTask studentTask4 = new StudentTask ("task4", student);
//        StudentTask studentTask5 = new StudentTask ("task5", student);

        studentTaskList.add(studentTask1);
        studentTaskList.add(studentTask2);
        studentTaskList.add(studentTask3);
//        studentTaskList.add(studentTask4);
//        studentTaskList.add(studentTask5);

//        student.setPhone("12345");
//        student.setName("Ivan");
        student.setTaskList(studentTaskList);

        studentDao.saveOrUpdate(student);

    }


}
