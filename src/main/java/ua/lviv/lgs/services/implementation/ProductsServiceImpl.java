package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ProductsDao;
import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.services.ProductsService;

import java.util.List;

/**
 * Created by Igaryok on 03.07.2016.
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsDao productsDao;

    @Transactional
    public void add(String Brand) {
        Products products = new Products(Brand);
        productsDao.add(products);
    }

    @Transactional
    public List<Products> findAll() {
        return productsDao.findAllProducts();
    }

    @Override
    public Products finById(int id) {
        return productsDao.findOne(id);
    }


}
