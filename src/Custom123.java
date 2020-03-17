import java.util.Scanner;

class Custom123{
public static void main(String[] args) {
    //Create a new scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter year
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Prompt user to enter first day of the year
    System.out.println("Enter the weekday that the year starts: ");
    int day = input.nextInt();
    int dayCounter = day;
    int nbrOfDays = 0;
    String monthx = "";
    for(int month = 1;month <= 12;month++) {

        // Switch to chose the month
        switch (month) {
            case 1:
                monthx = "January";
                nbrOfDays = 31;
                break;
            case 2:
                monthx = "February";
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    nbrOfDays = 29;
                    break;
                } else {
                    nbrOfDays = 28;
                    break;
                }
            case 3:
                monthx = "March";
                nbrOfDays = 31;
                break;
            case 4:
                monthx = "April";
                nbrOfDays = 30;
                break;
            case 5:
                monthx = "May";
                nbrOfDays = 31;
                break;

            case 6:
                monthx = "June";
                nbrOfDays = 30;
                break;
            case 7:
                monthx = "July";
                nbrOfDays = 31;
                break;
            case 8:
                monthx = "August";
                nbrOfDays = 31;
                break;
            case 9:
                monthx = "September";
                nbrOfDays = 30;
                break;
            case 10:
                monthx = "October";
                nbrOfDays = 31;
                break;
            case 11:
                monthx = "November";
                nbrOfDays = 30;
                break;
            case 12:
                monthx = "December";
                nbrOfDays = 31;
                break;
        }

        System.out.printf("%15s %d  \n" , monthx , year);
        System.out.println("----------------------------");
        System.out.printf("%s %s %s %s %s %s %s\n " , "Sun" , "Mon" , "Tue" , "Wed" , "Thu" , "Fri" , "Sat");

        for(int space = 1;space <= day;space++) {
            System.out.printf("%4s" , "    ");
        }
        for(int i = 1;i <= nbrOfDays;i++) {
            dayCounter++;
            if (dayCounter % 7 == 0)
                System.out.printf("%- 4d\n" , i);
            else
                System.out.printf("%-4d" , i);

        }
        day = (day+nbrOfDays) % 7;

        System.out.println();

        }
    }
}