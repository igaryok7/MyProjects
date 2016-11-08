package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Igaryok on 30.06.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {

    }

    @Transactional
    public List<User> findAllUser() {
        return entityManager.createQuery("from User ").getResultList();
    }

    @Transactional
    public User findOne(int id) {
        return entityManager.find(User.class, id);
    }

}
