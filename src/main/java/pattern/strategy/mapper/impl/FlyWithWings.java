package pattern.strategy.mapper.impl;

import pattern.strategy.mapper.FlyBehavior;

/**
 * @author NNroc
 * @date 2020/8/2 20:15
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
