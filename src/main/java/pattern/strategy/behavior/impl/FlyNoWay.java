package pattern.strategy.behavior.impl;

import pattern.strategy.behavior.FlyBehavior;

/**
 * @author NNroc
 * @date 2020/8/2 20:15
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
