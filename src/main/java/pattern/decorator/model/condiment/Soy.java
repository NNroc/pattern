package pattern.decorator.model.condiment;

import pattern.decorator.model.Beverage;
import pattern.decorator.model.CondimentDecorator;

/**
 * 豆浆
 *
 * @author NNroc
 * @date 2020/8/4 12:03
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
