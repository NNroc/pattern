package pattern.proxy.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author NNroc
 * @date 2020/8/18 14:39
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}