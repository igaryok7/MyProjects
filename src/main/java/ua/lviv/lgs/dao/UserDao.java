package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;


public interface UserDao {

    void add(User user);

    List<User> findAllUser();

    User findOne (int id);
}
