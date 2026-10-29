import java.net.*;
import java.io.*;

class Server{
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String msg = in.readUTF();
        System.out.println("Client:"+msg);

        out.writeUTF("Message Received");

        s.close();
        ss.close();
    }
}