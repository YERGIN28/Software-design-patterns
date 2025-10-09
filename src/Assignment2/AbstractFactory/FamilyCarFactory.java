package Assignment2.AbstractFactory;


public class FamilyCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar() {
        return new FamilyCarAF();
    }

    @Override
    public Engine createEngine() {
        return new FamilyEngine();
    }
}
