package RentCompany;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String LITER = "리터";
    private static final String SEPARATOR = ":";

    ArrayList<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        return this.cars.stream()
                .map(car ->
                   car.getName() + SEPARATOR
                    + car.getChargeQuantity() + LITER
                ).collect(Collectors.joining(NEWLINE));
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
