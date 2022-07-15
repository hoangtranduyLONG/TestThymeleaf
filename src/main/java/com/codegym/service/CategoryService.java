package com.codegym.service;

import com.codegym.model.Category;


import java.util.ArrayList;
import java.util.List;

public class CategoryService implements GeneralService<Category> {
    private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category(1, "Samsung"));
        categories.add(new Category(2, "Iphone"));
        categories.add(new Category(3, "XiaoMi"));
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public Category findById(int id) {
        for (Category c : categories
        ) {
            if (c.getId()==id){
                return c;
            }
        } return null;
    }

    @Override
    public void update(int id, Category category) {

    }

    @Override
    public void remove(int id) {

    }
}