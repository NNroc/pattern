package pattern.decorator.model.beverage;

import pattern.decorator.model.Beverage;

/**
 * 深焙
 *
 * @author NNroc
 * @date 2020/8/4 12:00
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
