package pattern.compound.model.adapter;

import pattern.compound.model.Observer;
import pattern.compound.model.Quackable;
import pattern.compound.model.impl.Observable;

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