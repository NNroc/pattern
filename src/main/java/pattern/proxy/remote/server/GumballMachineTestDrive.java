package pattern.proxy.remote.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * @author NNroc
 * @date 2020/8/18 14:49
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;
//        if (args.length < 2) {
//            System.out.println("GumballMachine ");
//            System.exit(1);
//        }

        try {
            // 本地注册
            LocateRegistry.createRegistry(1099);
            count = 100;
            gumballMachine = new GumballMachine("1099", count);
//            count = Integer.parseInt(args[1]);
//            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("rmi://localhost:" + "1099" + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}