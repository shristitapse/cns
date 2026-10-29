package exp11_rpc_largest;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println("Maximum = " + obj.maximum(14, 9));
    }
}
