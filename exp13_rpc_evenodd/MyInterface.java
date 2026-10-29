package exp13_rpc_evenodd;


import java.rmi.*;

public interface MyInterface extends Remote {
    String even_or_odd(int n) throws RemoteException;
}
