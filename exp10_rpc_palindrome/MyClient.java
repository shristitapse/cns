package exp10_rpc_palindrome;


import java.rmi.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        MyInterface obj = (MyInterface) Naming.lookup("rmi://localhost/calc");
        System.out.println(obj.is_palindrome("madam"));
    }
}
