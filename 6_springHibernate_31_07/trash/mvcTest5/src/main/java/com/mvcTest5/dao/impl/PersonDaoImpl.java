package com.mvcTest5.dao.impl;

import com.mvcTest5.dao.PersonDao;
import com.mvcTest5.entity.entityAssociation.oneToOne.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Person> menuList() {
        return null;
    }

    @Override
    public void remove(Person person) {

    }

    @Override
    public void saveOrUpdate(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }
}
