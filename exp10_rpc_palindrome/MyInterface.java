package exp10_rpc_palindrome;


import java.rmi.*;

public interface MyInterface extends Remote {
    boolean is_palindrome(String s) throws RemoteException;
}
