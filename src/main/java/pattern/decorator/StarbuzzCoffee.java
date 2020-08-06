package pattern.decorator;

import pattern.decorator.model.Beverage;
import pattern.decorator.model.beverage.DarkRoast;
import pattern.decorator.model.beverage.Espresso;
import pattern.decorator.model.beverage.HouseBlend;
import pattern.decorator.model.condiment.Mocha;
import pattern.decorator.model.condiment.Soy;
import pattern.decorator.model.condiment.Whip;

/**
 * @author NNroc
 * @date 2020/8/4 11:58
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 不加配料的 Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 加3个配料的 DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 加3个不同配料的 HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
