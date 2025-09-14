package Factory;

public class MainFactoryDemo {
    public static void main(String[] args) {
        Vehicle sportsCar = VehicleFactory.createVehicle("sports");
        sportsCar.drive();

        Vehicle familyCar = VehicleFactory.createVehicle("family");
        familyCar.drive();
    }
}
