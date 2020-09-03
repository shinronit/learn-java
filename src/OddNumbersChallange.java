public class OddNumbersChallange {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i= 1;i<1000;i+=2){
            System.out.println("Found number : " + i );
            count++;
            sum += i;
            if(count==5) {
                System.out.println("found 5 numbers. Exiting loop");
                System.out.println("Sum of the odd numbers are "+sum);
                break;
            }
        }
    }
}
