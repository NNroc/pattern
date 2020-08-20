package pattern.compound.facotry;

import pattern.compound.model.Quackable;

/**
 * @author NNroc
 * @date 2020/8/19 12:40
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}