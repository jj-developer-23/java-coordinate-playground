package RentCompany;

public class Sonata extends Car {
    double tripDistance;
    String carName = "Sonata";
    double distancePerLiter = 10;

    public Sonata(int distance) {
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
