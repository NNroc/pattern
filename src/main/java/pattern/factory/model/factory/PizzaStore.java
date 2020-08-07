package pattern.factory.model.factory;

import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 15:46
 */
public abstract class PizzaStore {
    // 把createPizza()方法设置成抽象的，由子类做决定
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}