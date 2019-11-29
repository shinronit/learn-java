public class Tutorial23 {
    public static void main(String[]args ){
           // a stands for amount
        // p stand for principal
        // three variable for three formula
            // 10000 is principal Subscribers or starting point
            double amount;
            double principal = 10000;
            double rate = .01;

            for(int day=11;day<=20;day++){
                amount=principal*Math.pow(1 + rate,day);
                System.out.println(day + " " +amount);
        }
    }
}