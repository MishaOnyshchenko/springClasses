package com.mvcTest5.dao.impl;

import com.mvcTest5.dao.ChildDao;
import com.mvcTest5.entity.entityAssociation.manyToOne.Child;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ChildDaoImpl implements ChildDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Child> childList() {
        return null;
    }

    @Override
    public void remove(Child child) {

    }

    @Override
    public void saveOrUpdate(Child child) {

    }
}