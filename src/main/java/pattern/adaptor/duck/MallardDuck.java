package pattern.adaptor.duck;

/**
 * 绿头鸭
 *
 * @author NNroc
 * @date 2020/8/14 11:07
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
