package DistributedApplication;

import java.rmi.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Interface obj = (Interface)Naming.lookup("rmi://127.0.0.1:5555/BCA");
        System.out.println("Cube of 5: " + obj.cube(5));
    }
}

