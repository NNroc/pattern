package pattern.state;

/**
 * @author NNroc
 * @date 2020/8/17 11:40
 */
public interface State {
    public void insertQuarter();   // 投入25分钱

    public void ejectQuarter();    // 拒绝25分钱

    public void turnCrank();       // 转动曲柄

    public void dispense();        // 发放糖果

    public void refill();          // 再次添加糖果
}