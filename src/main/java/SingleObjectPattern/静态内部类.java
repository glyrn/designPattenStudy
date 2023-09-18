package SingleObjectPattern;

/**
 * 线程安全 懒汉式
 */
public class 静态内部类 {

    private 静态内部类(){}

    private static class holder{
        private final static 静态内部类 INSTANCE = new 静态内部类();
    }
    public static final 静态内部类 getInstance(){
        return holder.INSTANCE;
    }

}
