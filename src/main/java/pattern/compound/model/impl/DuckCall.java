package pattern.compound.model.impl;

import pattern.compound.model.Observer;
import pattern.compound.model.Quackable;

/**
 * 鸭鸣器
 *
 * @author NNroc
 * @date 2020/8/19 12:18
 */
public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}