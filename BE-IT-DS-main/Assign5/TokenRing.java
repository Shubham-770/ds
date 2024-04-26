import java.util.*;
public class TokenRing {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of nodes you want in the ring:=");
        int n =sc.nextInt();

        System.out.println("ring is formed as below");
        for(int i=0;i<n;i++){
            System.out.print( i +" ");
        }
        System.out.println("0");

        int choice=0;
        do{
            System.out.print("Enter sender:");
            int sender=sc.nextInt();

            System.out.print("Enter receiver:");
            int receiver=sc.nextInt();

            System.out.print("Enter data to send:");
            int data=sc.nextInt();
            int token=0;
            System.out.println("Token passing");

            for( int i=token;i<sender;i++){
                System.out.print(" " +i + "->");
            }
            System.out.println(sender);
            System.out.println("sender "+ sender +" sending the "+data);

            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("data "+data+" is forwarded by "+ i);
            }

            System.out.println("receiver "+ receiver +" received the data "+ data);

            token=sender;

            System.out.print("Do you want to send data again ,if yes enter 1 else 0 :");
             choice=sc.nextInt();

        }while (choice==1);

    }
}
