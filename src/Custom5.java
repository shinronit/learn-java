import java.util.Scanner;

public class Custom5 {
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
