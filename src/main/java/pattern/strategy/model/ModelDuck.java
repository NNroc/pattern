package pattern.strategy.model;

import pattern.strategy.behavior.impl.FlyNoWay;
import pattern.strategy.behavior.impl.Quack;

/**
 * @author NNroc
 * @date 2020/8/2 20:50
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
