package pattern.observer.mapper;

/**
 * @author NNroc
 * @date 2020/8/3 11:07
 */
public interface Observer {
    /**
     * 所有观察者必须实现
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(double temp, double humidity, double pressure);
}
