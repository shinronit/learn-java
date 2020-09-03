public class theForStatement {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = "+calculateIntrest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = "+calculateIntrest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = "+calculateIntrest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = "+calculateIntrest(10000.0, 5.0));

        for (int i = 0;i < 10;i++) {
            System.out.println("Loop "+i+" hello!");
        }
        for (double l = 0;l < 10;l++) {
            System.out.println("10000 at "+l+"% interest = "+String.format("%.2f", calculateIntrest(10000.0, l)));
        }
        System.out.println();
        for (double l = 8;l > 0;l--) {
            System.out.println("10000 at "+l+"% interest = "+String.format("%.2f", calculateIntrest(10000.0, l)));
        }
        int count = 0;

        for (int i = 10;i < 50;i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number "+i+" is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static double calculateIntrest(double amount, double intersatRate) {
        return (amount * (intersatRate / 100));
    }

    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for (int i = 2;i < number / 2;i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
