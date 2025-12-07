package SocketProgramming;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client2 {
    public static void main(String[] main) throws Exception {
        Socket s = new Socket("localhost", 5000);

        Scanner obj = new Scanner(System.in);

        String csays = "";
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        while (true) {
            System.out.print("Client: ");
            csays = obj.nextLine();

            dos.writeUTF(csays);

            if (csays.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.println("Server: " + dis.readUTF());
        }

        s.close();
        obj.close();
    }
}
