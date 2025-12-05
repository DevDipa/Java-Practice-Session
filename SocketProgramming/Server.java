package SocketProgramming;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws Exception {
        //get the Server ready in Listening mode
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Hey, yo! This is MC Server. Imma listenin', Bro...always listenin'. Bring it on, Brother...");

        //accept the Client's request
        Socket s = ss.accept();

        //get the message from the Client
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Client: " + dis.readUTF());

        //reply 
        Scanner obj = new Scanner(System.in);
        System.out.print("Server: ");
        String ssays = obj.nextLine();

        //sent it to the Client
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(ssays);

        ss.close();
        obj.close();
    }
}
