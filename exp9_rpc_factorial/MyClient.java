package exp9_rpc_factorial;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println("Factorial = " + obj.factorial(5));
    }
}
