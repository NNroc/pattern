package pattern.strategy.mapper.impl;

import pattern.strategy.mapper.QuackBehavior;

/**
 * @author NNroc
 * @date 2020/8/2 20:22
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
