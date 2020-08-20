package pattern.compound.model.impl;

import java.util.ArrayList;
import java.util.Iterator;
import pattern.compound.model.Observer;
import pattern.compound.model.QuackObservable;

/**
 * @author NNroc
 * @date 2020/8/19 17:00
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}