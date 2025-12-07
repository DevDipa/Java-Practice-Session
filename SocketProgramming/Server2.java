package SocketProgramming;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is listening...");

        Socket s = ss.accept();

        Scanner obj = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while (true) {
            String csays = dis.readUTF();

            if (csays.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.println("Client: " + csays);

            System.out.print("Server: ");
            String ssays = obj.nextLine();
            dos.writeUTF(ssays);
        }

        obj.close();
        s.close();
        ss.close();
    }
}
