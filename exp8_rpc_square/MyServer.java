package exp8_rpc_square;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class MyServer extends UnicastRemoteObject implements MyInterface {
    MyServer() throws RemoteException {}

    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("calc", new MyServer());
        System.out.println("Server ready");
    }
}
