package factoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // circle
        ShapeFactory.getShape("circle").draw();
        // rectangle
        ShapeFactory.getShape("RECTANGLE").draw();
        //  square
        ShapeFactory.getShape("square").draw();
    }
}
