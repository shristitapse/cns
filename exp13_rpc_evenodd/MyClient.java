package exp13_rpc_evenodd;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println(obj.even_or_odd(7));
    }
}
