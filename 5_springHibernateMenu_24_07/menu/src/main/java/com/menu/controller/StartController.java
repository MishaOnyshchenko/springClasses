package com.menu.controller;

import com.menu.entity.Menu;
import com.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/")
public class StartController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public String showPage(Model model){
        model.addAttribute("menuList", menuService.menuList());
        return "start";
    }


    @GetMapping("add")
    public String addMenu(@RequestParam(value = "title") String title){
        Menu menu = new Menu(title);
        menuService.saveOrUpdate(menu);

        return "redirect:/";
    }

}

