package pattern.compound.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author NNroc
 * @date 2020/8/19 16:34
 */
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    /**
     * 迭代器模式
     */
    public void quack() {
        Iterator iterator = quackers.iterator();
        while ((iterator.hasNext())) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while ((iterator.hasNext())) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}