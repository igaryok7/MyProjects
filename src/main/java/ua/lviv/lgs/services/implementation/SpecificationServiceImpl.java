package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.SpecificationDao;
import ua.lviv.lgs.entity.Specification;
import ua.lviv.lgs.services.SpecificationService;

import javax.xml.ws.soap.Addressing;

/**
 * Created by Igaryok on 03.07.2016.
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationDao specificationDao;

    @Transactional
    public void add(String display, int expansion, String procesor, int camera, String country) {
        Specification specification = new Specification(display, expansion, procesor, camera, country);
        specificationDao.add(specification);
    }
}
