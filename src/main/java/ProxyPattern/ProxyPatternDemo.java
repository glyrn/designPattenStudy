package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("a");
        System.out.println(1);
        image.display();
        System.out.println();
        image.display();
    }
}
