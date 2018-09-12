package com.menu.service.impl;

import com.menu.dao.MenuDao;
import com.menu.entity.Menu;
import com.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> menuList() {
        System.out.println("List size is -->" + menuDao.menuList().size());
        return  menuDao.menuList();
    }

    @Override
    public boolean saveOrUpdate(Menu menu) {

        return menuDao.saveOrUpdate(menu);
    }
}
