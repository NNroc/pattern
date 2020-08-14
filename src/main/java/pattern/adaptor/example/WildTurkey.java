package pattern.adaptor.example;

/**
 * 正常的火鸡
 *
 * @author NNroc
 * @date 2020/8/14 11:11
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}