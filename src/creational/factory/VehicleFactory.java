package creational.factory;

public class VehicleFactory {

    public Vehicle buildVehicleByTypeAndName(VehicleType vehicleType, String name) {
        switch (vehicleType) {
            case CAR:
                return new Car(name);
            case BIKE:
                return new Bike(name);
            default:
                return null;
        }
    }
}
