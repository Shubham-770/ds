import java.rmi.*;


public class server {

public static void main(String args[]){

 try{
       
          Serverimpl robj=new Serverimpl();
          Naming.rebind("server",robj);
          
          System.out.println("server is ready");
       
       }
       catch(Exception e){
       
       System.out.println("error in the code"+ e);
       
       }
}
      


}