package com.mvcTest5.dao;

import com.mvcTest5.entity.entityAssociation.oneToMany.Worker;

import java.util.List;

public interface WorkerDao {

    List<Worker> workerList();

    void remove(Worker worker);

    void saveOrUpdate(Worker worker);
}
