package com.mvcTest3.controller;

import com.mvcTest3.entity.Student;
import com.mvcTest3.service.UserService;
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
    private UserService userService;

    List <Student> studentListModify = null;

    @RequestMapping(method = RequestMethod.GET)
    public String getStudentList(Model model){
        model.addAttribute("userList", userService.userList());
        model.addAttribute("userListModify", studentListModify);
        return "start";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String getModifyStudentList(Model model){
        studentListModify = userService.userListWithModify();
        return "redirect:/";
    }

    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public String getStudentSalary(Model model){
        userService.userListWithCel().forEach((k,v) -> System.out.println(k+"------"+v));
        return "redirect:/";
    }
}
