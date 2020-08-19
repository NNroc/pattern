package pattern.compound.duck.model;

/**
 * 鸭子接口
 *
 * @author NNroc
 * @date 2020/8/19 12:14
 */
public interface Quackable extends QuackObservable {
    public void quack();
}