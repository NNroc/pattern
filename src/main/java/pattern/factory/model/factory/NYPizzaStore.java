package pattern.factory.model.factory;

import pattern.factory.model.pizza.NYStyleCheesePizza;
import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 19:10
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}