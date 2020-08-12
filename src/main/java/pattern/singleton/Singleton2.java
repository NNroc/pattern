package pattern.singleton;

/**
 * @author NNroc
 * @date 2020/8/12 14:42
 */
public class Singleton2 {
    // 当 uniqueInstance 变量被出身寒微 Singleton2 实例时，多个线程正确处理它
    // 这个方法打打减少 getInstance() 的时间消耗，优化性能
    private volatile static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }

}
