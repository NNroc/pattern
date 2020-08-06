package pattern.decorator.model;

/**
 * 调料
 * CondimentDecorator 取代 Beverage
 *
 * @author NNroc
 * @date 2020/8/4 11:48
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
