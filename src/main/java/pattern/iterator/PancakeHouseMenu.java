package pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author NNroc
 * @date 2020/8/16 11:29
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 调用菜单栏 ArrayList 的 iterator() 方法，所以不需要 PancakeHouseMenuIterator 类
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public String toString() {
        return "Object ville Pancake House Menu";
    }

    // other menu methods here
}