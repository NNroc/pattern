package pattern.factory.model.pizza;

import pattern.factory.model.pizza.Pizza;

/**
 * @author NNroc
 * @date 2020/8/7 15:40
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
