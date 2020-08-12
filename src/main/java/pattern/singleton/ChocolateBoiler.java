package pattern.singleton;

/**
 * @author NNroc
 * @date 2020/8/12 14:31
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 填充巧克力和牛奶的混合物
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 排出煮沸的巧克力和牛奶的混合物
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
