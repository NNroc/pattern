package pattern.proxy.rmiRemote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author NNroc
 * @date 2020/8/18 12:36
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}