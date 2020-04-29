import java.util.Scanner;

public class Custom164 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String appId = "";
        String appNumber = "";
        String appName = "";
        String developerName = "";
        int numberOfPublishedApps = 0;
        boolean released;
        if(appId.equals("")||appNumber.equals("")||appName.equals("")){
            released = false;
        }else {
            released = true;
        }
        System.out.println("App is released " + released);
        System.out.println("Hi thanks for creating your account.");
        System.out.print("Enter developer name to continue : ");
        developerName = scanner.next();
        System.out.println(developerName + " sounds cool Let's roll");
        if(numberOfPublishedApps==0){
            System.out.println("Looks like you haven't published an app yet");
        }else {
            System.out.println("Your account has published " + numberOfPublishedApps + " great work.");
            System.out.println("Do you want to check your apps name ?");
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("Y")){
                System.out.println();
            }else {
                System.out.println("");
            }
        }

    }
}
