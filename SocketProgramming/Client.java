package SocketProgramming;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception{
        //establish connection with the server
        Socket s = new Socket("localhost",5000);

        //take user input
        Scanner obj = new Scanner(System.in);
        System.out.print("Client: ");
        String csays = obj.nextLine();

        //write the client's message to the Server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(csays);

        //receive the Server's message and read it
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Server: " + dis.readUTF());

        s.close();
        obj.close();
    }
}
