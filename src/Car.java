public class Car {
    private final int seats;
    private final Engine engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;


    private Car(Builder builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.hasGPS = builder.hasGPS;
        this.hasTripComputer = builder.hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car {" +
                "seats=" + seats +
                ", engine=" + engine +
                ", hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }


    public static class Builder {
        private int seats;
        private Engine engine;
        private boolean hasGPS;
        private boolean hasTripComputer;

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder setTripComputer(boolean hasTripComputer) {
            this.hasTripComputer = hasTripComputer;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
