package com.mvcTest5.dao;

import com.mvcTest5.entity.entityAssociation.oneToOne.Person;

import java.util.List;


public interface PersonDao {

    List<Person> menuList();

    void remove(Person person);

    void saveOrUpdate(Person person);
}
