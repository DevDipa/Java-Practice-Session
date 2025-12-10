package DistributedApplication;

import java.rmi.*;
import java.rmi.server.*;

public class Implementer extends UnicastRemoteObject implements Interface{
    Implementer() throws RemoteException{
        super();
    }

    public int cube(int num) {
        return num*num*num;
    }
}

