package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Products;

import java.util.List;


public interface ProductsService {

    void add(String Brand);

    List<Products> findAll();

    Products finById(int id);
}
