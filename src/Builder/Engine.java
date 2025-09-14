package Builder;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine type: " + type + " is running.");
    }
}
