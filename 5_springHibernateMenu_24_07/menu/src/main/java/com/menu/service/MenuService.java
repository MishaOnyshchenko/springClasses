package com.menu.service;

import com.menu.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> menuList();

    boolean saveOrUpdate(Menu menu);
}
