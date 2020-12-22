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
        // 拥有两个披萨店：ny 和 chicago
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        // 分别准备披萨
        // ny
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("ny 披萨店提供了一个 " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("clam");
        System.out.println("ny 披萨店提供了一个 " + pizza.getName() + "\n");
        // chicago
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("chicago 披萨店提供了一个 " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("chicago 披萨店提供了一个 " + pizza.getName() + "\n");
    }
}
