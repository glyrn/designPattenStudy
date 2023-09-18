package SingleObjectPattern;

/**
 * 这种不支持多线程，没有加锁
 */
public class 懒汉式线程不安全 {
    private static 懒汉式线程不安全 instance;
    private 懒汉式线程不安全(){}

    public static 懒汉式线程不安全 getInstance() {
        if (instance == null){
            instance = new 懒汉式线程不安全();
        }

        return instance;
    }
}


