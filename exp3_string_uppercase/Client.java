package exp3_string_uppercase;


import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        Scanner sc = new Scanner(System.in);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        System.out.print("Enter string: ");
        out.writeUTF(sc.nextLine());

        System.out.println("Uppercase = " + in.readUTF());

        s.close();
    }
}
