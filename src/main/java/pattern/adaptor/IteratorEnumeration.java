package pattern.adaptor;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author NNroc
 * @date 2020/8/14 14:27
 */
public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}