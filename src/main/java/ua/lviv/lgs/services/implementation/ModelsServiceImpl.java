package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ModelsDao;
import ua.lviv.lgs.dao.ProductsDao;
import ua.lviv.lgs.entity.Models;
import ua.lviv.lgs.services.ModelsService;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * Created by Igaryok on 03.07.2016.
 */
@Service
public class ModelsServiceImpl implements ModelsService {

    @Autowired
    private ModelsDao modelsDao;

    @Autowired
    private ProductsDao productsDao;

    @Transactional
    public void add(String model, int memory, int price, String id) {
        Models models = new Models(model, memory, price);
        models.setProducts(productsDao.findOne(Integer.parseInt(id)));
        modelsDao.add(models);
    }

    @Override
    public List<Models> findAllModels() {
        return modelsDao.findAllModels();
    }
}
