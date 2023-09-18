package SingleObjectPattern;

/**
 * 第一次调用才会初始化 加锁
 */
public class 懒汉式线程安全 {
    private static 懒汉式线程安全 instance;
    private 懒汉式线程安全(){}

    public static synchronized 懒汉式线程安全 getInstance(){
        if (instance == null) {
            instance = new 懒汉式线程安全();
        }
        return instance;
    }
}
