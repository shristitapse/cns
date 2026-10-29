package exp11_rpc_largest;


import java.rmi.*;

public interface MyInterface extends Remote {
    int maximum(int a, int b) throws RemoteException;
}

