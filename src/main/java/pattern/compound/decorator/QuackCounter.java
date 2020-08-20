package pattern.compound.decorator;

import pattern.compound.model.Observer;
import pattern.compound.model.Quackable;

/**
 * 装饰者 记录叫声次数
 *
 * @author NNroc
 * @date 2020/8/19 12:31
 */
public class QuackCounter implements Quackable {
    public Quackable duck;
    public static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}