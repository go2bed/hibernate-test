package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.entity.AbstractEntity;

import java.util.List;

/**
 *
 */
public interface Dao<T extends AbstractEntity> {

    List<T> getFullList();
    boolean save(T object);
    boolean delete(int id);
    T getById(int id);
}
