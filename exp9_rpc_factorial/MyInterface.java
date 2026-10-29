package exp9_rpc_factorial;


import java.rmi.*;

public interface MyInterface extends Remote {
    long factorial(int n) throws RemoteException;
}
