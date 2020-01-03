import java.util.Scanner;

public class Custom27 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String liftInput;

        int floor;
        int button = 4;
        System.out.println("Select floor 1,2,3");

        for ( int i = 0;i < 10;i++ ) {
            liftInput = scanner.nextLine();
            if (liftInput.equals("1")) {
                floor = 1;
                System.out.println("Current floor " + floor);
            } else if (liftInput.equals("2")) {
                floor = 2;
                System.out.println("Current floor " + floor);
            } else if (liftInput.equals("3")){
                floor = 3;
                System.out.println("Current floor " + floor);
            }
        }
    }
}
