package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Models;

import java.util.List;


public interface ModelsService {

    void add(String model, int memory, int price, String id);

    List<Models> findAllModels();
}
