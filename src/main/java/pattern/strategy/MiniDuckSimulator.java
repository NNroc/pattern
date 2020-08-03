package pattern.strategy;

import pattern.strategy.behavior.impl.FlyRocketPowered;
import pattern.strategy.model.Duck;
import pattern.strategy.model.MallardDuck;
import pattern.strategy.model.ModelDuck;

/**
 * 定义了算法族，分别封装了起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户，以 Duck 为例。
 * <p>
 * 设计原则：
 * 1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
 * 2. 针对接口编程，而不是针对实现编程。 例：每个实现对应一个接口，如 FlyBehavior、QuackBehavior。
 * 3. 多用组合，少用继承。
 *
 * @author NNroc
 * @date 2020/8/2 20:24
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
