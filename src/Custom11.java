import java.util.Scanner;
import java.util.Random;

public class Custom11 {
    public static void main(String[] args){

        //name field code here
        System.out.println("Enter your name");
        Scanner name = new Scanner(System.in);

        System.out.println("Hi " + name.next( ) + " you are stuck in an old military base choose between two doors  ");
        System.out.print("door1 , door2 type down in small cases");
        System.out.println("");
        System.out.println("");

        Scanner inputplayer = new Scanner(System.in);
        String stage1 = inputplayer.nextLine( );
        if ( stage1.equals("door1") ) {
            System.out.println("You successfully came out of the basement");
            System.out.println("Oh no! guards saw me");
            System.out.println("Option 1 : Run away as fast as possible");
            System.out.println("Option 2 : Shout Help! and tell the guards you are stuck");
            System.out.println("Use 1 for option 1 and 2 for option 2 ");
        } else if ( stage1.equals("door2") ) {
            System.out.println("You were killed by armed soldiers ");
            System.out.println("You Died");
            System.exit(1);
        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }

        Scanner inputplayer2 = new Scanner(System.in);
        String stage2 = inputplayer.nextLine( );
        if ( stage2.equals("1") ) {
            System.out.println("Soliders thought you are a criminal and shooted you ");
            System.out.println("You died");
            System.exit(1);
        } else if ( stage2.equals("2") ) {
            System.out.println("They said we cannot help because some Chinese terrorists are surrounding here");
            System.out.println("So they dropped me near a shack for night stay but");
            System.out.println("You are still inside the military base");
            System.out.println("I see a helicopter and a car");
            System.out.println("Option 1 : Drive the car and get out of this place ");
            System.out.println("Option 2 : Drive the plane and get out of this place");
        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }
        Scanner inputplayer3 = new Scanner(System.in);
        String stage3 = inputplayer.nextLine( );
        if ( stage3.equals("1") ) {
            System.out.println("You were killed by Chinese terrorists");
            System.out.println("YOU DIED");
            System.exit(1);
        } else if ( stage3.equals("2") ) {
            System.out.println("Plane take off got succesfull");
            System.out.println("You are almost out of this place");
            System.out.println("Where should I land ");
            System.out.println("The closest places are ");
            System.out.println("Option 1 : China");
            System.out.println("Option 2 : India");
        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }
        Scanner inputplayer4 = new Scanner(System.in);
        String stage4 = inputplayer.nextLine( );
        if ( stage4.equals("1") ) {
            System.out.println("You were shooted by Chinese army");
            System.out.println("YOUR PLANE GOT CRASHED AND YOU ARE DEAD");
            System.exit(1);
        } else if ( stage4.equals("2") ) {
            System.out.println("Looks like Airport controllers are trying to tall to me");
            System.out.println("What should I do");
            System.out.println("Option 1 : Talk to them");
            System.out.println("Option 2 : Ignore them and land the plane first");
        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }
        Scanner inputplayer5 = new Scanner(System.in);
        String stage5 = inputplayer.nextLine( );
        if ( stage5.equals("1") ) {
            System.out.println("OK Pilot we are sending some backups for your plane landing.");
            System.out.println("You : Ok Thank you.");
            System.out.println("Controller : Please push the red button so that the wheels would be opened.");
            System.out.println("You : Ok I pressed it.");
            System.out.println("Controller : Ok now push the wheel upwards a little. ");
            System.out.println("Controller : Switch off auto pilot and just wait. ");
            System.out.println("You : I almost god landed just a little more.");
            System.out.println("Controller : You are landed succesfully. ");
            System.out.println("You :  Thank you so much I will never forget this help.");
            System.out.println("Option 1 : Go out and thank them : ");
            System.out.println("Option 2 : Turn off the engine first because plane was attacked earlier by rockets when i was at the army base. ");
        } else if ( stage5.equals("2") ) {
            System.out.println("Yourr plane got crashed because you never landed a plane ");
            System.out.println("YOU DIED IN PLANE EXPLOSION");
        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }
        Scanner inputplayer6 = new Scanner(System.in);
        String stage6 = inputplayer.nextLine( );
        if ( stage6.equals("1") ) {
            System.out.println("Plane got exploded");
            System.out.println("YOU ARE DEAD");
            System.exit(1);
        } else if ( stage6.equals("2") ) {
            System.out.println("I turned the engine off and now going to meet the controller");
            System.out.println("Controller : Congrats for your safe landing");
            System.out.println("You : Thank you so much");
            System.out.println("");
            System.out.println("Congrats player for completing the game");

        } else {
            System.out.println("You have to choose between two option");
            System.exit(1);
        }

    }
}
