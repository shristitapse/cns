package exp4_evenodd;


import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        Scanner sc = new Scanner(System.in);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        System.out.print("Enter number: ");
        out.writeInt(sc.nextInt());

        System.out.println(in.readUTF());

        s.close();
    }
}
