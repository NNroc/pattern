package pattern.compound.duck.facotry;

import pattern.compound.duck.model.Quackable;
import pattern.compound.duck.model.impl.DuckCall;
import pattern.compound.duck.model.impl.MallardDuck;
import pattern.compound.duck.model.impl.RedheadDuck;
import pattern.compound.duck.model.impl.RubberDuck;

/**
 * @author NNroc
 * @date 2020/8/19 12:42
 */
public class DuckFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
