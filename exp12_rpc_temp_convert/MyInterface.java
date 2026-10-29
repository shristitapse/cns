package exp12_rpc_temp_convert;


import java.rmi.*;

public interface MyInterface extends Remote {
    double to_fahrenheit(double c) throws RemoteException;
}
