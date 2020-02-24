import java.util.Random;

public class Custom103 {
    public static void main (String[]args){
        int jobs = 10;
        Random random = new Random();
        int interviewTaker = random.nextInt(15);
        if (interviewTaker<jobs){
            System.out.println("Only " + interviewTaker + " people can give interview today");
            int peopleLucky = random.nextInt(10);
            System.out.println("First interview is of number " + peopleLucky);
        }else{
            System.out.println("Everyone can give there interview today");
        }
    }
}
