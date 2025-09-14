package Builder;

public class CarBuilder {
    private String model;
    private Engine engine;

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        return new Car(model, engine);
    }
}
