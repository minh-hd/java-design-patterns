package dev.minhhd.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int numberOfSeats) {
        manual.setSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        manual.setHasGPS(hasGPS);
    }
}
