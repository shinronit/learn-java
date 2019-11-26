import java.util.Scanner;  //scanner
public class Tutorial21 {
    public static void main (String[]args){
            Scanner input = new Scanner(System.in);//scanner
            int total = 0; // total holds the sum of all the grades
            int grade; // grade allows to add number individualy
            int average; // for printinga average in console later
            int counter = 0;// variable for while loop

            while (counter < 10){
                grade = input.nextInt();// input temporarily stored in grade
                total = total + grade;
                counter++;
            }
            average=total/10;
            System.out.println("Your average is"+ average);
    }
}
