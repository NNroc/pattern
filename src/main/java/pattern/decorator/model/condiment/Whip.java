package pattern.decorator.model.condiment;

import pattern.decorator.model.Beverage;
import pattern.decorator.model.CondimentDecorator;

/**
 * 奶油
 *
 * @author NNroc
 * @date 2020/8/4 12:04
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
