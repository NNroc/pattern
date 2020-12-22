package pattern.factory.model.factory;

import pattern.factory.model.pizza.ChicagoStyleCheesePizza;
import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 19:10
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}