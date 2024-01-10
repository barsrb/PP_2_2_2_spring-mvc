package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDao {
    private final List<Car> cars;

    public CarsDao() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Car1", "Model1"));
        cars.add(new Car(2, "Car2", "Model2"));
        cars.add(new Car(3, "Car3", "Model3"));
        cars.add(new Car(4, "Car4", "Model4"));
        cars.add(new Car(5, "Car5", "Model5"));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size() || count == 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
