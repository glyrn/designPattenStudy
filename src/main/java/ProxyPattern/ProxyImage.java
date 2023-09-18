package ProxyPattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
//        if (realImage == null) {
//            realImage = new RealImage(fileName);
//        }
//        realImage.display();
        Class<RealImage> realImageClass = RealImage.class;
        try {
            Method display = realImageClass.getMethod("display");
            display.invoke(new RealImage("a"));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
