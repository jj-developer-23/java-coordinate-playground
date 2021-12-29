package RentCompany;

public class K5 extends Car{
    double tripDistance;
    String carName = "K5";
    double distancePerLiter = 13;

    public K5(double distance) {
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
