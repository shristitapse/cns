package exp13_rpc_evenodd;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class MyServer extends UnicastRemoteObject implements MyInterface {
    MyServer() throws RemoteException {}

    public String even_or_odd(int n) {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("calc", new MyServer());
        System.out.println("Server ready");
    }
}
