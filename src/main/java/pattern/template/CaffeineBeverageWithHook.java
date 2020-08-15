package pattern.template;

/**
 * 模板方法
 *
 * @author NNroc
 * @date 2020/8/15 16:21
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子，子类可以选择性覆盖
     *
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}