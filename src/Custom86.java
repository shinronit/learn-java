import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Custom86 {
    public static void main(String[] args) {
        System.out.println("Press Enter To stop");
        Scanner scanner = new Scanner(System.in);
        Thread th = new Thread(new Runnable()
        {
            public void run()
            {
                while(true)
                {
                    Date date = Calendar.getInstance().getTime();
                    DateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss.SSS a");
                    String today = formatter.format(date);
                    System.out.print("Today : " + today+"\r");
                    try{
                        Thread.sleep(100);}catch(Exception ex){}
                }
            }
        });
        th.start();
        String input = scanner.nextLine();
        if (input.equals("")){
            System.out.println("Time has been stoped");
            th.stop();
        }
    }
}