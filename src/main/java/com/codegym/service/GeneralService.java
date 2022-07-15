package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface GeneralService<E> {

    List<E> getAll();

    void save(E e);

    E findById(int id);

    void update(int id, E e);

    void remove(int id);
}