package pattern.proxy.access;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author NNroc
 * @date 2020/8/18 15:55
 */
public class OwnerInvocationHandler implements InvocationHandler {
    //持有RealSubject的引用(这样底层就可以调用RealSubject的方法)
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    //proxy的任何代码被调用，就会导致invoke方法被调用
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                //不允许被评价者调用setHotOrNotRating方法，会抛出异常
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            //捕捉真正主题抛出的异常
            e.printStackTrace();
        }
        //如果调用的是其他的方法，这里不予理会
        return null;
    }
}