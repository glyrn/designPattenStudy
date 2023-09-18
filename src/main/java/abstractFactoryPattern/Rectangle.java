package abstractFactoryPattern;



public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle init :: draw() is called");
    }
}
