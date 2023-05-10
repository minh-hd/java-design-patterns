package dev.minhhd.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int numberOfSeats) {
        this.car.setSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setHasGPS(hasGPS);
    }

    public Car getResult() {
        return this.car;
    }
}
