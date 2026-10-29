package exp8_rpc_square;



import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println("Square = " + obj.square(5));
    }
}

