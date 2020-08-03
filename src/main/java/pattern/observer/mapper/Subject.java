package pattern.observer.mapper;

/**
 * @author NNroc
 * @date 2020/8/3 11:04
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param o 观察者
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o 观察者
     */
    public void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
