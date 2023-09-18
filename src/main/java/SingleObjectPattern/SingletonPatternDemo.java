package SingleObjectPattern;



public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 尝试直接创造对象

//        try {
//            new SingleObject(); // forbigd
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        // 获取对象
        SingleObject instance = SingleObject.getInstance();

        instance.showMessage();

    }
}
