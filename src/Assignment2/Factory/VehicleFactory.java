package Assignment2.Factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "sports":
                return new SportsCar();
            case "family":
                return new FamilyCar();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
