package pattern.proxy.rmiRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author NNroc
 * @date 2020/8/18 12:37
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://localhost:1099/RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}