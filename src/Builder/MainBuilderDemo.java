package Builder;

public class MainBuilderDemo {
    public static void main(String[] args) {
        Car sportsCar = new CarBuilder()
                .setModel("Ferrari")
                .setEngine(new Engine("V8 Turbo"))
                .build();

        sportsCar.showInfo();
    }
}
