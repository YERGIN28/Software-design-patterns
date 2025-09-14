public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setSeats(2)
                .setEngine(new Engine("Sport Engine"))
                .setGPS(true)
                .setTripComputer(true)
                .build();

        System.out.println(sportsCar);

        Car familyCar = new Car.Builder()
                .setSeats(5)
                .setEngine(new Engine("Economy Engine"))
                .setGPS(false)
                .setTripComputer(false)
                .build();

        System.out.println(familyCar);
    }
}
