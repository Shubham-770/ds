import  java.rmi.*;

import java.rmi.server.*;


public class Serverimpl extends UnicastRemoteObject implements ServerIntf{

		public Serverimpl()throws RemoteException{
		}
		
		public double addition(double num1, double num2)throws RemoteException{
		
		
		return num1+num2;
		}


}