import java.util.Scanner;
import java.util.Random;

public class Custom17 {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SHIN WIFI SOFTWARE.");
        System.out.println("THIS PROGRAM IS LIMITED TO COMPANY MEMBERS.");
        System.out.println("IF YOU DO NOT HAVE A REGISTERED EMAIL YOU CANNOT USE THIS SOFTWARE.");
        System.out.println();
        System.out.println("Enter your shin mail id to continue.");
        Scanner consoleInputScanner = new Scanner(System.in);
        String consoleInput = consoleInputScanner.nextLine();

        if (consoleInput.equals("cjthehacker7@shinmails.com")) {
            System.out.println("WELCOME BACK");
            System.out.println();
        } else {
            System.out.println("You are not allowed to view this content make sure you have a registered id");
            System.exit(0);
        }

        System.out.println("Enter your shin mail password");
        System.out.println("If you want to reset your password press 2 and then enter");
        consoleInput = consoleInputScanner.nextLine();
        if (consoleInput.equals("Quantum")) {
            System.out.println("PASSWORD MATCHED WITH YOUR EMAIL ID LOGGING YOU IN.");
            System.out.println("YOU CAN ACCESS THIS PAGE.");
            System.out.println();
            System.out.println("Showing WIFI nearby.");
            System.out.println("Password protected. ");
            System.out.println("astha");
            System.out.println("AbhishekJio");
            System.out.println("sharmajii");
            System.out.println("Tanay");
            System.out.print("Which one to hack use the wifi name + rest of the code" + "// use default password finder variable");
            System.out.println(" Which was teached you in your SHIN ACADEMY");
            consoleInput = consoleInputScanner.nextLine();
            if (consoleInput.equals("astha = shin password finder.setactive = true " +
                    "astha.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name astha is 00000000");
                System.out.println("LOGGING YOU OUT SUCCESSFULLY ");
            } else if (consoleInput.equals("AbhishekJio = shin password finder.setactive = true " +
                    "AbhishekJio.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name Abhishekjio is 55555555");
            } else if (consoleInput.equals("sharmajii = shin password finder.setactive = true " +
                    "sharmajii.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name sharmajii is 66666666");
            } else if (consoleInput.equals("Tanay = shin password finder.setactive = true " +
                    "Tanay.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name Tanay is 99999999");
            } else {
                System.out.println("Make sure to write a Wifi name ");
                System.out.println("MAKE SURE YOU DON'T MAKE ANY SCRIPT ERRORS");
                System.out.println("Program exited");
                System.exit(0);
            }

        } else if (consoleInput.equals("2")) {
            System.out.println("Enter your new SHIN Mail password");
            consoleInputScanner.nextLine();
            System.out.println("Password reset sucessfull");
            System.out.println("Enter your shin mail password");
            consoleInput = consoleInputScanner.nextLine();
            if (consoleInput.equals(consoleInputScanner)) {
                System.out.println("PASSWORD MATCHED WITH YOUR EMAIL ID LOGGING YOU IN.");
                System.out.println("YOU CAN ACCESS THIS PAGE.");
                System.out.println();
                System.out.println("Showing WIFI nearby.");
                System.out.println("Password protected. ");
                System.out.println("astha");
                System.out.println("AbhishekJio");
                System.out.println("sharmajii");
                System.out.println("Tanay");
                System.out.print("Which one to hack use the wifi name + rest of the code" + " //use default password finder variable");
                System.out.println(" Which was teached you in your SHIN ACADEMY");
                consoleInput = consoleInputScanner.nextLine();
            } else {
                System.out.println("Wrong password make sure your password is correct");
            }

            if (consoleInput.equals("astha = shin password finder.setactive = true " +
                    "astha.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name astha is 00000000");
                System.out.println("LOGGING YOU OUT SUCCESSFULLY ");
            } else if (consoleInput.equals("AbhishekJio = shin password finder.setactive = true " +
                    "AbhishekJio.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name Abhishekjio is 55555555");
            } else if (consoleInput.equals("sharmajii = shin password finder.setactive = true " +
                    "sharmajii.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name sharmajii is 66666666");
            } else if (consoleInput.equals("Tanay = shin password finder.setactive = true " +
                    "Tanay.get.range + securitylevel + password")) {
                System.out.println("Password of WIFI name Tanay is 99999999");
            } else {
                System.out.println("Make sure to write a Wifi name ");
                System.out.println("MAKE SURE YOU DON'T MAKE ANY SCRIPT ERRORS");
                System.out.println("Program exited");
                System.exit(0);
            }
        } else {
                System.out.println("Wrong password make sure your password is correct");
        }
    }
}
