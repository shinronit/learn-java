import java.util.Scanner;  // Takes information that a user types  from a keyboard and stores it in a variable.

public class Tutorial8 {
    public static void main(String[] args) {
        Scanner cuckoo = new Scanner(System.in);

        int girls, boys, people;
        girls = 7;
        boys = 3;
        people = girls % boys;
        System.out.println(people);
    }
}
