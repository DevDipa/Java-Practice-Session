package DistributedApplication;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, java.net.MalformedURLException {
        Implementer obj = new Implementer();
        LocateRegistry.createRegistry(5555);
        Naming.rebind("rmi://127.0.0.1:5555/BCA", obj);
        System.out.println("Server is listening...");
    }
}

