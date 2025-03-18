import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();
    private Car leader;

    public void addCar(Car car) {
        cars.add(car);
        updateLeader(car);
    }

    private void updateLeader(Car car) {
        if (leader == null || car.distanceIn24Hours() > leader.distanceIn24Hours()) {
            leader = car;
        }
    }

    public Car getLeader() {
        return leader;
    }
}

