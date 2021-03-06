package pattern.factory.model.factory;

import pattern.factory.model.pizza.CheesePizza;
import pattern.factory.model.pizza.ClamPizza;
import pattern.factory.model.pizza.Pizza;
import pattern.factory.model.pizza.VeggiePizza;

/**
 * @author NNroc
 * @date 2020/8/7 15:47
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}