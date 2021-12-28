package RentCompany;

public class K5 extends Car{
    double tripDistance;
    String carName = "K5";
    double distancePerLiter = 13;

    public K5(double distance) {
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
