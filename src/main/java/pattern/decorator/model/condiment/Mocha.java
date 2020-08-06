package pattern.decorator.model.condiment;

import pattern.decorator.model.Beverage;
import pattern.decorator.model.CondimentDecorator;

/**
 * 摩卡
 *
 * @author NNroc
 * @date 2020/8/4 11:55
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
