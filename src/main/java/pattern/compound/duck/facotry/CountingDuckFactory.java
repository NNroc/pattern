package pattern.compound.duck.facotry;

import pattern.compound.duck.decorator.QuackCounter;
import pattern.compound.duck.model.Quackable;
import pattern.compound.duck.model.impl.DuckCall;
import pattern.compound.duck.model.impl.MallardDuck;
import pattern.compound.duck.model.impl.RedheadDuck;
import pattern.compound.duck.model.impl.RubberDuck;

/**
 * @author NNroc
 * @date 2020/8/19 16:29
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
