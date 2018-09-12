package com.menu.dao.impl;

import com.menu.dao.MenuDao;
import com.menu.entity.Menu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.*;

@Repository
@Transactional
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Menu> menuList() {
        Session session = sessionFactory.getCurrentSession();
        Query<Menu> menuQuery = session.createQuery("from Menu", Menu.class);
        return menuQuery.getResultList();
    }

    @Override
    public boolean saveOrUpdate(Menu menu) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.saveOrUpdate(menu);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
        }

        return false;
    }
}
