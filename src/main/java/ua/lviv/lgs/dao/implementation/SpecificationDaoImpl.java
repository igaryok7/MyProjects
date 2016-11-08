package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.SpecificationDao;
import ua.lviv.lgs.entity.Specification;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Repository
public class SpecificationDaoImpl implements SpecificationDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Specification specification) {
        entityManager.persist(specification);
    }

}
