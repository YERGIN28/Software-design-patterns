package Assignment2.AbstractFactory;


public class SportsCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar() {
        return new SportsCarAF();
    }

    @Override
    public Engine createEngine() {
        return new SportsEngine();
    }
}
