package com.mvcTest5.dao;

import com.mvcTest5.entity.MenuObject;

import java.util.List;

public interface MenuDao {

    List<MenuObject> menuList();

    void remove(MenuObject menu);

    void saveOrUpdate(MenuObject menu);

}
