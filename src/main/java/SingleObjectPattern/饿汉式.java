package SingleObjectPattern;

/**
 * 常用 在类加载阶段就初始化，浪费内存
 */
public class 饿汉式 {
    private static 饿汉式 instance = new 饿汉式();
    private 饿汉式(){}

    public static 饿汉式 getInstance(){
        return instance;
    }
}
