package exp7_rpc_add;


import java.rmi.*;

public interface MyInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}
