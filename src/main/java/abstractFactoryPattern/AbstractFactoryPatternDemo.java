package abstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractionFactory shapeFactory = FactoryProducer.getFactory("shape");
//        获取circle对象
                Shape shape1 = shapeFactory.getShape("circle");
                shape1.draw();
    }
}
