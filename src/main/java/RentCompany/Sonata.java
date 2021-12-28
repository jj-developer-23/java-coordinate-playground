package RentCompany;

public class Sonata extends Car {
    double tripDistance;
    String carName = "Sonata";
    double distancePerLiter = 10;

    public Sonata(int distance) {
        tripDistance = distance;
    }


    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return carName;
    }
}
