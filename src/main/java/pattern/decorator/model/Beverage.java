package pattern.decorator.model;

/**
 * 饮料
 *
 * @author NNroc
 * @date 2020/8/4 11:36
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
