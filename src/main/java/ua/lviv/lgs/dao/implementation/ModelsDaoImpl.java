package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ModelsDao;
import ua.lviv.lgs.entity.Models;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Repository
public class ModelsDaoImpl implements ModelsDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Models models) {
        entityManager.persist(models);
    }

    @Override
    public List<Models> findAllModels() {
        return entityManager.createQuery("from Models ").getResultList();
    }

}
