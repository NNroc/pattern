package pattern.compound.duck.model;

/**
 * 观察者接口（可以看到，观察者中update需要一个Quackable对象，这就是为什么需要QuackObservableAbstract抽象类的原因）
 *
 * @author NNroc
 * @date 2020/8/19 19:30
 */
public interface Observer {
    public void update(QuackObservable duck);
}