import java.net.*;
import java.io.*;
import java.util.*;
class Client {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",5000);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        System.out.println("Enter msg:");
        String msg = sc.nextLine();
        
        out.writeUTF(msg);
        System.out.println(in.readUTF());

        s.close();
    }
    
}
