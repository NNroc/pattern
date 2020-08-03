package pattern.strategy.model;

import pattern.strategy.behavior.impl.FlyWithWings;
import pattern.strategy.behavior.impl.Quack;

/**
 * @author NNroc
 * @date 2020/8/2 20:24
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
