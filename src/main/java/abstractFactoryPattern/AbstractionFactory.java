package abstractFactoryPattern;

/**
 * 为颜色和形状创建抽象类 来获取工厂
 */
public abstract class AbstractionFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
