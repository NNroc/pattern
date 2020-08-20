package pattern.compound;

import pattern.compound.decorator.QuackCounter;
import pattern.compound.facotry.AbstractDuckFactory;
import pattern.compound.facotry.CountingDuckFactory;
import pattern.compound.model.Flock;
import pattern.compound.model.Quackable;
import pattern.compound.model.adapter.Goose;
import pattern.compound.model.adapter.GooseAdapter;
import pattern.compound.model.impl.Quackologist;

/**
 * 鸭子模拟器
 *
 * @author NNroc
 * @date 2020/8/19 12:23
 */
public class DuckSimulator {
    public void simulate(AbstractDuckFactory duckFactory) {
        // 鸭子和鸭子工厂
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator: With Abstract Factory");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("With Observer");
        // 创建一个 Quackologist 把它注册成一个群的观察者
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("Ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    public void simulate(Quackable quack) {
        quack.quack();
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        new DuckSimulator().simulate(duckFactory);
    }
}