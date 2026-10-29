package exp12_rpc_temp_convert;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println("Fahrenheit = " + obj.to_fahrenheit(100));
    }
}
