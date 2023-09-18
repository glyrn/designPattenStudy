package FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
    public static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle: " + color);
        }

        return circle;
    }
}
