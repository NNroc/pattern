package pattern.compound.facotry;

import pattern.compound.decorator.QuackCounter;
import pattern.compound.model.Quackable;
import pattern.compound.model.impl.DuckCall;
import pattern.compound.model.impl.MallardDuck;
import pattern.compound.model.impl.RedheadDuck;
import pattern.compound.model.impl.RubberDuck;

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