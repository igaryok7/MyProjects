package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BarringsDao;
import ua.lviv.lgs.entity.Barrings;
import ua.lviv.lgs.services.BarringsService;

import javax.xml.ws.soap.Addressing;

/**
 * Created by Igaryok on 03.07.2016.
 */
@Service
public class BarringServiceImpl implements BarringsService {

    @Autowired
    private BarringsDao barringsDao;

    @Transactional
    public void add(String model, String payment) {
        Barrings barrings = new Barrings(model, payment);
        barringsDao.add(barrings);
    }
}
