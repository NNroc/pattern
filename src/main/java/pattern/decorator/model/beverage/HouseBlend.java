package pattern.decorator.model.beverage;

import pattern.decorator.model.Beverage;

/**
 * 综合
 *
 * @author NNroc
 * @date 2020/8/4 11:53
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
