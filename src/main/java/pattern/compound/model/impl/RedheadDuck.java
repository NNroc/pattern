package pattern.compound.model.impl;

import pattern.compound.model.Observer;
import pattern.compound.model.Quackable;

/**
 * 红头鸭
 *
 * @author NNroc
 * @date 2020/8/19 12:22
 */
public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}