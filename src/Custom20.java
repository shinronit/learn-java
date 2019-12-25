import java.util.Scanner;

public class Custom20 {
    public static void main(String[] args) {
        int carSpeed = 1;
        for (int loop = 1; loop<100; loop++){
            System.out.println("Current Speed is km/ph - " + carSpeed++);
            if(carSpeed>50){
                System.out.println("Data has been changed and you have been disconnected.");
                System.exit(0);
            }else if (carSpeed == 49){
                System.out.println("MAXIMUM SPEED REACHED.");
            }else{
                // DO NOTHING //
            }
        }
    }
}
