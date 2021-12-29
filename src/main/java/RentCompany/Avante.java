package RentCompany;

public class Avante extends Car {
    double tripDistance;
    String carName = "Avante";
    double distancePerLiter = 15;

    public Avante(double distance) {
        tripDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return carName;
    }
}
