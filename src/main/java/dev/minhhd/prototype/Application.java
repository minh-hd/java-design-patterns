package dev.minhhd.prototype;

public class Application {

    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        Rectangle rectangle = new Rectangle();
        rectangle.x = 3;
        rectangle.y = 5;
        rectangle.color = "Yellow";
        rectangle.height = 10;
        rectangle.width = 20;

        Shape newRectangle = rectangle.clone();

        System.out.println(newRectangle);

        cache.put("Yellow Rectangle", newRectangle);
        System.out.println(cache.get("Yellow Rectangle"));
    }
}
