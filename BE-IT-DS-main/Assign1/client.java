import java.rmi.*;
import java.util.*;

public class client{
     public static void main(String[] args){
     
     Scanner sc =new Scanner(System.in);
     
      try{
      
       String serverURL="rmi://localhost/server";
     ServerIntf sobj=(ServerIntf) Naming.lookup(serverURL);
     
     System.out.println("enter first number");
     double num1= sc.nextDouble();
     
     System.out.println("enter second number");
     double num2= sc.nextDouble();
     
     System.out.println(" first number is "+num1);
     
     System.out.println(" second number is "+num2);
      
     System.out.println(" result is");
      
     System.out.println("addition is "+sobj.addition(num1,num2)); 
      
      
      }catch(Exception e){
      
      System.out.print("error"+e);
      }
     
   
     }



}