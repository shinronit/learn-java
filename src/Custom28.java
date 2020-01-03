import java.util.Random;

public class Custom28 {
    public static void main (String []args){
        Random random = new Random();
        int people = random.nextInt(100);
        int ping = random.nextInt(999);
        System.out.println(people);

        if(people >60){
            System.out.print("CANNOT CONNECT TO THE SERVER PLEASE TRY AGAIN LATER. Queue ");
            System.out.println(100 - people);
        }else{
            System.out.println("Joined the server with a ping of " + ping);
            System.out.println("SERVERS ARE BUSY OR THEY ARE UNDER MAINTENANCE");
            System.out.println("EXITING THE SERVER....");
        }
    }
}
