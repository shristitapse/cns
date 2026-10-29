package exp7_rpc_add;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println("Sum = " + obj.add(6, 4));
    }
}
