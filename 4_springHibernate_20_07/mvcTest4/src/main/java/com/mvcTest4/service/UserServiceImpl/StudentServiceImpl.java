package com.mvcTest4.service.UserServiceImpl;

import com.mvcTest4.dao.StudentDao;
import com.mvcTest4.entity.Student;
import com.mvcTest4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
//@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> userList() {

        return studentDao.userList();
    }



    @Override
    public List<Student> userListWithModify() {
        List<Student> studentList = studentDao.userList();
        for (Student student : studentList) {
            student.setName(student.getName() + " -word");
//            System.out.println(student.getName());
        }
        return studentList;
    }

    @Override
    public Map<Student, String> userListWithCel() {

        List<Student> studentList = studentDao.userList();
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
        studentDao.sdd(student);
    }


}
