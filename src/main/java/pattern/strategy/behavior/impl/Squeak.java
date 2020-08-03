package pattern.strategy.behavior.impl;

import pattern.strategy.behavior.QuackBehavior;

/**
 * @author NNroc
 * @date 2020/8/2 20:23
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
