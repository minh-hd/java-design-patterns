package dev.minhhd.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private final Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 8;
        circle.radius = 10;
        circle.color = "Blue";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 13;
        rectangle.height = 10;
        rectangle.width = 30;
        rectangle.color = "Red";

        cache.put("Blue Circle", circle);
        cache.put("Red Rectangle", rectangle);
    }

    public void put(String key, Shape shape) {
        cache.put(key, shape);
    }

    public Shape get(String key) {
        return cache.get(key).clone()
                ;
    }
}
