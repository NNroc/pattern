package pattern.factory.model.pizza;

import java.util.ArrayList;

/**
 * @author NNroc
 * @date 2020/8/7 15:04
 */
public abstract class Pizza {
    String name; //名称
    String dough; //面团类型
    String sauce; //酱料
    ArrayList<String> toppings = new ArrayList<String>(); //作料

    public void prepare() {
        System.out.println("准备 " + name);
        System.out.println("揉面团...");
        System.out.println("添加酱料...");
        System.out.println("添加作料: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("把Pizza对角切片");
    }

    public void box() {
        System.out.println("把Pizza装盒子");
    }

    public String getName() {
        return name;
    }
}