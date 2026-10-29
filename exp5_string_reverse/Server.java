package exp5_string_reverse;


import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String str = in.readUTF();
        String rev = new StringBuilder(str).reverse().toString();

        out.writeUTF(rev);

        s.close();
        ss.close();
    }
}
