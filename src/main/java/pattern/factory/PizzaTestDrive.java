package pattern.factory;

import pattern.factory.model.factory.ChicagoPizzaStore;
import pattern.factory.model.factory.NYPizzaStore;
import pattern.factory.model.factory.PizzaStore;
import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 15:45
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
