package exp12_rpc_temp_convert;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class MyServer extends UnicastRemoteObject implements MyInterface {
    MyServer() throws RemoteException {}

    public double to_fahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("calc", new MyServer());
        System.out.println("Server ready");
    }
}
