import java.util.ArrayList;
import java.util.stream.Collectors;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    ArrayList<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        return this.cars.stream()
                .map(car ->
                   car.getName() + ":"
                    + car.getChargeQuantity() + "리터"
                ).collect(Collectors.joining(NEWLINE));
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
