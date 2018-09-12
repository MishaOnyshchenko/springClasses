package com.menu.dao;

import com.menu.entity.Menu;

import java.util.List;

public interface MenuDao {

    List<Menu> menuList();

    boolean saveOrUpdate(Menu menu);


}
