package com.mvcTest3.service.UserServiceImpl;

import com.mvcTest3.dao.UserDao;
import com.mvcTest3.entity.Student;
import com.mvcTest3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
//    @Qualifier(value = "userMethodForDb")
    private UserDao userDao;

    @Override
    public List<Student> userList() {
        List<Student> studentList = userDao.userList();
        for (Student student : studentList) {
            System.out.println("Student name -> " + student.getName());
        }
        System.out.println("Size of list = " + studentList.size());
        Student student1 = new Student("Vadik", "cell", "25");
        addStudent(student1);
        Student student = userDao.getById(1);
        System.out.println("Get student byId = " + student.getName());

        return userDao.userList();
    }

    @Override
    public List<Student> userListId() {
//        List<Student> studentList = userDao.userList();
//        Student student = userDao.getById(1);
//        System.out.println("Get student byId = " + student.getName());
        return userDao.userList();
    }



    @Override
    public List<Student> userListWithModify() {
        List<Student> studentList = userDao.userList();
        for (Student student : studentList) {
            student.setName(student.getName() + " -word");
            System.out.println(student.getName());
        }
        return studentList;
    }

    @Override
    public Map<Student, String> userListWithCel() {

        List<Student> studentList = userDao.userList();
        Map<Student, String> userSalary = new HashMap<>();
        for (int i = 0; i < studentList.size(); i++) {
            userSalary.put(studentList.get(i), String.valueOf(i + 100));
        }

        return userSalary;
    }

    @Override
    public Student getById() {
        return null;
    }

    @Override
    public void addStudent(Student student) {
        userDao.sddStudent(student);
    }


}
