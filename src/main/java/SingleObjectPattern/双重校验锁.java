package SingleObjectPattern;

/**
 * 这里的double checked 是 防止一个线程先判断是空 然后阻塞
 *
 * 另一个线程拿到锁并初始化 释放锁之后 前一个线程恢复 所以需要再次检查
 */
public class 双重校验锁 {
    private volatile static 双重校验锁 instance;
    private 双重校验锁(){}

    public static 双重校验锁 getInstance(){
        if (instance == null) {
            synchronized (双重校验锁.class) {
                if (instance == null) {
                    instance = new 双重校验锁();
                }
            }
        }
        return instance;
    }
}
