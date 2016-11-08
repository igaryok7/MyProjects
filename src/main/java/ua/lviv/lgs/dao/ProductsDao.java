package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Products;

import java.util.List;


public interface ProductsDao {

    void add(Products products);

    List<Products> findAllProducts ();

    Products findOne(int id);
}
