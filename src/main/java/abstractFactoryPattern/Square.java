package abstractFactoryPattern;



public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square init :: draw() is called");
    }
}
