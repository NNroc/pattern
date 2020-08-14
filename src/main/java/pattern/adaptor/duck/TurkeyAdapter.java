package pattern.adaptor.duck;

/**
 * 火鸡对象伪造鸭子对象
 *
 * @author NNroc
 * @date 2020/8/14 11:09
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    /**
     * 由于飞的短，所以需要飞多次
     */
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
