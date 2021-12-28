public class Avante extends Car {
    double tripDistance;
    String carName = "Avante";
    double distancePerLiter = 15;

    public Avante(double distance) {
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
