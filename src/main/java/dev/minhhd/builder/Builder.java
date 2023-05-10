package dev.minhhd.builder;

public interface Builder {
    void reset();

    void setSeats(int numberOfSeats);

    void setEngine(String engine);

    void setGPS(boolean hasGPS);
}
