package pattern.strategy.behavior.impl;


import pattern.strategy.behavior.FlyBehavior;

/**
 * @author NNroc
 * @date 2020/8/2 20:53
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}