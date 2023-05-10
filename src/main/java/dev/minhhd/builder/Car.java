package dev.minhhd.builder;

public class Car {
    int seats;
    String engine;
    boolean hasGPS;

    public Car() {
    }

    public Car(int seats, String engine, boolean hasGPS) {
        this.seats = seats;
        this.engine = engine;
        this.hasGPS = hasGPS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", hasGPS=" + hasGPS +
                '}';
    }
}
