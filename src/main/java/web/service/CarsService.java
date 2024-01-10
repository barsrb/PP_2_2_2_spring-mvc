package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarsDao carsDao;

    public List<Car> getCars(int count) {
        return carsDao.getCars(count);
    }
}
