package exp8_rpc_square;


import java.rmi.*;

public interface MyInterface extends Remote {
    int square(int n) throws RemoteException;
}
