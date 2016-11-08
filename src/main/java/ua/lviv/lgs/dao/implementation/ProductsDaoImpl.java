package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ProductsDao;
import ua.lviv.lgs.entity.Products;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Repository
public class ProductsDaoImpl implements ProductsDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Products products) {
        entityManager.persist(products);
    }

    @Override
    public List<Products> findAllProducts() {
        return entityManager.createQuery("from Products ").getResultList();
    }

    @Override
    public Products findOne(int id) {
        return entityManager.find(Products.class, id);
    }


}
