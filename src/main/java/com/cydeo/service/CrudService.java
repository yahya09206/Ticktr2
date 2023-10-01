package com.cydeo.service;

public interface CrudService {

    T save(T object);
    List<T> findAll();
    T findById(ID id);
}
