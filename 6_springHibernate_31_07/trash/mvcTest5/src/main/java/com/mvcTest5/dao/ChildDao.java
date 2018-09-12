package com.mvcTest5.dao;

import com.mvcTest5.entity.entityAssociation.manyToOne.Child;

import java.util.List;

public interface ChildDao {

    List<Child> childList();

    void remove(Child child);

    void saveOrUpdate(Child child);
}
