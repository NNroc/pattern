package pattern.decorator.model.beverage;

import pattern.decorator.model.Beverage;

/**
 * 低咖啡因
 *
 * @author NNroc
 * @date 2020/8/4 12:02
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
