package com.menu.config;

import com.menu.entity.Menu;
import com.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitDataToDb {

    @Autowired
    private MenuService menuService;

    @PostConstruct
    private void init(){

        Menu menu1 = new Menu("1");
        Menu menu2 = new Menu("2");
        Menu menu3 = new Menu("3");
        Menu menu4 = new Menu("4");
        Menu menu5 = new Menu("5");

        menuService.saveOrUpdate(menu1);
        menuService.saveOrUpdate(menu2);
        menuService.saveOrUpdate(menu3);
        menuService.saveOrUpdate(menu4);
        menuService.saveOrUpdate(menu5);

    }
}
