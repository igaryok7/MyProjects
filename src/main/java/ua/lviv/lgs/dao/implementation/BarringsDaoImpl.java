package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BarringsDao;
import ua.lviv.lgs.entity.Barrings;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Repository
public class BarringsDaoImpl implements BarringsDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Barrings barrings) {
        entityManager.persist(barrings);
    }
}
