package SocketProgramming;

import java.net.*;
import java.util.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);

        byte[] recMsg = new byte[1024];
        DatagramPacket recDp = new DatagramPacket(recMsg, recMsg.length);
        
    }
}
