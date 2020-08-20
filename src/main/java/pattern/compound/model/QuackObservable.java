package pattern.compound.model;

/**
 * 观察者接口，鸭鸣观察
 *
 * @author NNroc
 * @date 2020/8/19 16:56
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}