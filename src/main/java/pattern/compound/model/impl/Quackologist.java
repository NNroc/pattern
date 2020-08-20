package pattern.compound.model.impl;

import pattern.compound.model.Observer;
import pattern.compound.model.QuackObservable;

/**
 * 观察者，哪只鸭子叫了
 *
 * @author NNroc
 * @date 2020/8/19 19:32
 */
public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}