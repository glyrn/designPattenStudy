package factoryPattern;

public class ShapeFactory {
    // 使用getShape 方法获取形状类型的对象
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

//        if(shapeType.equalsIgnoreCase("CIRCLE")){
//            return new Circle();
//        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
//            return new Rectangle();
//        } else if(shapeType.equalsIgnoreCase("SQUARE")){
//            return new Square();
//        }
        try {
            switch (shapeType.toUpperCase()) {
                case "CIRCLE":
                    return new Circle();
                case "RECTANGLE":
                    return new Rectangle();
                case "SQUARE":
                    return new Square();
                default:
                    throw new IllegalArgumentException("类型" + shapeType + "不合法");
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
