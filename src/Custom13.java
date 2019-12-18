import java.util.Scanner;

public class Custom13 {
    public static void main(String[] args) {
        System.out.println("Student present book");
        System.out.println();

        Scanner present = new Scanner(System.in);
        int totalStudents, presentStudents, absent;

        System.out.println("Total number of students :   ");
        totalStudents = present.nextInt();

        System.out.println("Enter number of students present:   ");
        presentStudents = present.nextInt();

        absent = totalStudents - presentStudents;
        System.out.println("Students absent " + absent);

        if (absent > presentStudents){
            System.out.println("A lot of students are absent");
        }else{
            System.out.println("A lot of students are present");
        }
    }
}
