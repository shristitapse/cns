package exp2_sum;
import java.net.*;
import java.io.*;


class Server {
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        Socket s =ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int a = in.readInt();
        int b = in.readInt();

        out.writeInt(a+b);

        s.close();
        ss.close();
    }
}
