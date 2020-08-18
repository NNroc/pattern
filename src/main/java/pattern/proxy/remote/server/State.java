package pattern.proxy.remote.server;

import java.io.Serializable;

/**
 * @author NNroc
 * @date 2020/8/18 14:39
 */
public interface State extends Serializable {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}