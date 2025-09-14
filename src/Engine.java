public class Engine {
    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
