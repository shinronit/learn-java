import java.util.Random;
import java.util.Scanner;

public class Custom79{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ping = random.nextInt(999);
        String serverIP = "192.168.812.120";
        System.out.println("Please type your device ip");
        String userIpInput = scanner.nextLine();
        if (userIpInput.startsWith("192")){
        }else{
            System.out.println("Make sure to use a valid ip address if the problem still exists it means your ip is not valid");
            System.exit(0);
        }
        System.out.println("Please write server ip to join");
        String input = scanner.nextLine();
        for ( int i = 0; i < 1; )
        if (input.equals(serverIP)){
            System.out.println("Joined server with a ping of " + ping);
            i=2;
        }else{
            System.out.println("Server IP does't matches with our records please check and try again");
            input = scanner.nextLine();
        }
        System.out.println("Server : Welcome to the Server");
        String input1 = scanner.nextLine();
        System.out.println("Client : " + input1);
    }
}