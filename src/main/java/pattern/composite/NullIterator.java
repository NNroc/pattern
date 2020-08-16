package pattern.composite;

import java.util.Iterator;

/**
 * @author NNroc
 * @date 2020/8/16 21:48
 */
public class NullIterator implements Iterator<MenuComponent> {

    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}