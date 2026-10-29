package exp2_sum;
import java.net.*;
import java.io.*;
import java.util.*;

class Client {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",5000);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        System.out.println("Enter two numbers:");
        out.writeInt(sc.nextInt());
        out.writeInt(sc.nextInt());

        System.out.println("Sum="+in.readInt());

        s.close();
    }
}
