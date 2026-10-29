package exp4_evenodd;


import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int n = in.readInt();

        if (n % 2 == 0)
            out.writeUTF("Even");
        else
            out.writeUTF("Odd");

        s.close();
        ss.close();
    }
}
