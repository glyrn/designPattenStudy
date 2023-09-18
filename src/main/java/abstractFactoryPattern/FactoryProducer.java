package abstractFactoryPattern;

/**
 * 工厂创造器 传递颜色或者和形状信息 来获取对应的工厂
 */
public class FactoryProducer {
    public static AbstractionFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
