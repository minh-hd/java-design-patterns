package dev.minhhd.builder;

public class Director {

    public void makeSUV(CarBuilder builder) {
        builder.setSeats(7);
        builder.setEngine("V12");
        builder.setGPS(false);
    }

    public void makeSportsCar(CarBuilder builder) {
        builder.setSeats(2);
        builder.setEngine("V16");
        builder.setGPS(true);
    }
}
