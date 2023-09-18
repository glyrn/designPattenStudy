package SingleObjectPattern;

public class SingleObject {
    // 创建一个singleobject的对象
    private static SingleObject instance = new SingleObject();

    // 创建构造函数   私有 外部不能调用
    private SingleObject(){};

    // 获取唯一可用对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello !!!");

    }



}
