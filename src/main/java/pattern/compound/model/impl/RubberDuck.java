package pattern.compound.model.impl;

import pattern.compound.model.Observer;
import pattern.compound.model.Quackable;

/**
 * 橡皮鸭
 *
 * @author NNroc
 * @date 2020/8/19 12:20
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("squeak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}