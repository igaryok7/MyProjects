package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.User;

import java.util.List;


public interface UserService {

    void add(String LastName, String FirsyName, int agg, String UserName, String password);

    void add(User user);

    List<User> findAllUser();

    User findOne (int id);

}
