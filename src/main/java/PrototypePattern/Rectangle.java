package PrototypePattern;

public class Rectangle extends Shape{

    public Rectangle() {
        type = "rectangle";
    }


    @Override
    void draw() {
        System.out.println("rectangle :: draw() called");
    }
}
