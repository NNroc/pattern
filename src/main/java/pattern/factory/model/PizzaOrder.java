package pattern.factory.model;

import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 15:13
 */
public abstract class PizzaOrder {
    public PizzaOrder() {
        // 披萨对象
        Pizza pizza = null;
        // 订单类型
        String orderType;
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    protected abstract Pizza createPizza(String orderType);

    private String getOrderType() {
        return "";
    }
}
