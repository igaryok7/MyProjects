package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.services.UserService;

import java.util.List;

/**
 * Created by Igaryok on 03.07.2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(String LastName, String FirsyName, int agg, String UserName, String password) {

    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> findAllUser() {
        return findAllUser();
    }

    @Override
    public User findOne(int id) {
        return null;
    }
}
