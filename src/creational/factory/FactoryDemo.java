package creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Vehicle V_01 = new VehicleFactory()
                .buildVehicleByTypeAndName(VehicleType.CAR, "Audi Q7");
        Vehicle V_02 = new VehicleFactory()
                .buildVehicleByTypeAndName(VehicleType.CAR, "BMW X1");
        Vehicle V_03 = new VehicleFactory()
                .buildVehicleByTypeAndName(VehicleType.BIKE, "Yamaha RX100");

        V_01.drive();
        V_02.drive();
        V_03.drive();
    }
}
