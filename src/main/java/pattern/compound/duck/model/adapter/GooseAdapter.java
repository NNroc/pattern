package pattern.compound.duck.model.adapter;

import pattern.compound.duck.model.Observer;
import pattern.compound.duck.model.Quackable;
import pattern.compound.duck.model.impl.Observable;

/**
 * 鹅适配成鸭子
 *
 * @author NNroc
 * @date 2020/8/19 12:27
 */
public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
    }

    public void notifyObservers() {
    }
}