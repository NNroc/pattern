package pattern.singleton;

/**
 * 构造器私有
 * 确保类只有一个实例，并提供一个全局访问点
 *
 * @author NNroc
 * @date 2020/8/12 14:22
 */
public class Singleton {
    // 在静态除初始器中创建单件，保证线程安全
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
//        有实例既可直接使用
//        if (uniqueInstance == null) {
//            uniqueInstance = new Singleton();
//        }
        return uniqueInstance;
    }
}
