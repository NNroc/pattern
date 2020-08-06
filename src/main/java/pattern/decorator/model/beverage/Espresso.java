package pattern.decorator.model.beverage;

import pattern.decorator.model.Beverage;

/**
 * 浓缩咖啡
 *
 * @author NNroc
 * @date 2020/8/4 11:51
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
