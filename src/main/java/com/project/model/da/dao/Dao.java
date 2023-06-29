package com.project.model.da.dao;

import java.util.List;

public interface Dao<T>{
    T save(T t);
    T getOneById(int id);

    List<T> getAll();

    boolean deleteById(int id);

    T update(T t);
}
