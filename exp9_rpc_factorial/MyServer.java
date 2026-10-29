package exp9_rpc_factorial;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class MyServer extends UnicastRemoteObject implements MyInterface {
    MyServer() throws RemoteException {}

    public long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("calc", new MyServer());
        System.out.println("Server ready");
    }
}

