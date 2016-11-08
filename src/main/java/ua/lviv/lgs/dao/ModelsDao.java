package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Models;
import java.util.List;

public interface ModelsDao {

    void add(Models models);

    List<Models> findAllModels();
}
