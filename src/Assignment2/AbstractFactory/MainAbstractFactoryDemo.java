package Assignment2.AbstractFactory;


public class MainAbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractCarFactory sportsFactory = new SportsCarFactory();
        Car sportsCar = sportsFactory.createCar();
        Engine sportsEngine = sportsFactory.createEngine();
        sportsCar.drive();
        sportsEngine.start();

        AbstractCarFactory familyFactory = new FamilyCarFactory();
        Car familyCar = familyFactory.createCar();
        Engine familyEngine = familyFactory.createEngine();
        familyCar.drive();
        familyEngine.start();
    }
}
