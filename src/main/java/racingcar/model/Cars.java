package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static Cars of(String[] names, MovableStrategy movableStrategy) {
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name, movableStrategy));
        }

        return new Cars(cars);
    }

    public int carsSize() {
        return cars.size();
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    public int totalCurPosition() {
        int totalCurPosition = 0;

        for (Car car : cars) {
            totalCurPosition += car.curPosition();
        }

        return totalCurPosition;
    }
}
