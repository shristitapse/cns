package exp7_rpc_add;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class MyServer extends UnicastRemoteObject implements MyInterface {
    MyServer() throws RemoteException {}

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("calc", new MyServer());
        System.out.println("Server ready");
    }
}

