package pattern.template;

/**
 * @author NNroc
 * @date 2020/8/15 16:20
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
