import java.util.Scanner;

public class Custom122 {
    public static void main (String [] args){
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        String gameName = "cuckoo";
        if (gameName!="cuckoo"){
            System.out.println("Error please download the game again");
            System.exit(382330);
        }
        System.out.println("Give a small iq test");
        System.out.println("Which one of the five is least like the other four?");
        System.out.println("Dog\n"+
                "Mouse\n"+
                "Lion\n"+
                "Snake\n"+
                "Elephant\n"+
                "I don’t know");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("snake")){
            System.out.println("Nice");
            points += 100;
        }else {
            System.out.println("Wrong answer");
        }


        System.out.println("Mary, who is sixteen years old, is four times as old as her brother. How old will Mary be when she is twice as old as her brother?\n");
        System.out.println("20\n"+
                "24\n"+
                "25\n"+
                "26\n"+
                "28");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("24")){
            System.out.println("Nice");
            points += 100;
        }else {
            System.out.println("Wrong answer");
        }


        System.out.println("The day after the day after tomorrow is four days before Monday. What day is it today?\n");
        System.out.println("A. Monday\n"+
                "B. Tuesday\n"+
                "C. Wednesday\n"+
                "D. Thursday\n"+
                "E. Friday");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("monday")){
            System.out.println("Nice");
            points += 100;
        }else {
            System.out.println("Wrong answer");
        }
        System.out.println("your score " + points);
        if (points==100){
            System.out.println("You need to learn more");
        }else if (points==200){
            System.out.println("Excellent job");
        }else if (points==300){
            System.out.println("Ultra impressive work");
        }else {
            System.out.println("Go study more this is not for kids");
        }
    }
}
