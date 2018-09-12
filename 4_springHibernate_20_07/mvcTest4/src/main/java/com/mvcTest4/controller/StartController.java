package com.mvcTest4.controller;

import com.mvcTest4.entity.Student;
import com.mvcTest4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class StartController {

    @Autowired
    private StudentService studentService;

    List <Student> studentListModify = null;

    @RequestMapping(method = RequestMethod.GET)
    public String getStudentList(Model model){
        model.addAttribute("userList", studentService.userList());
        model.addAttribute("userListModify", studentListModify);
        return "start";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String getModifyStudentList(Model model){
        studentListModify = studentService.userListWithModify();
        return "redirect:/";
    }

    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public String getStudentSalary(Model model){
        studentService.userListWithCel().forEach((k, v) -> System.out.println(k+"------"+v));
        return "redirect:/";
    }
}
