package pattern.proxy.remote.client;

import java.rmi.Naming;
import pattern.proxy.remote.server.GumballMachineRemote;

/**
 * @author NNroc
 * @date 2020/8/18 14:42
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
//                "rmi://santafe.mightygumball.com/gumballmachine",
//                "rmi://boulder.mightygumball.com/gumballmachine",
//                "rmi://seattle.mightygumball.com/gumballmachine",
                "rmi://localhost:1099/gumballmachine"
        };
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
