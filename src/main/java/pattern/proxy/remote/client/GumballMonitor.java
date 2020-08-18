package pattern.proxy.remote.client;

import java.rmi.RemoteException;
import pattern.proxy.remote.server.GumballMachineRemote;

/**
 * @author NNroc
 * @date 2020/8/18 14:42
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    //我们依赖于远程接口
    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {//对可能产生的网络异常进行捕获和处理
            e.printStackTrace();
        }
    }
}