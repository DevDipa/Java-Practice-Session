package DistributedApplication;

import java.rmi.*;

public interface Interface extends Remote {
    public int cube(int num) throws RemoteException;
}


