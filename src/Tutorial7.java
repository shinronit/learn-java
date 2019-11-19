import java.util.Scanner;  // Takes information that a user types  from a keyboard and stores it in a variable.

public class Tutorial7 {
    public static void main(String[] args) {
        Scanner cuckoo = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter First Number:   ");
        fnum = cuckoo.nextDouble();
        System.out.println("Enter Second Number:   ");
        snum = cuckoo.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
