package dev.minhhd.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSUV(builder);
        Car car = builder.getResult();

        System.out.println(car);
    }
}
