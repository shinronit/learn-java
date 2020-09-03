public class theWhileAndDoWhileStatements {
    public static void main(String[] args) {
        int count = 1;

        int number = 4;
        int finsih = 20;
        int numbersFound = 0;
        while (number <= finsih){
            number++;
            if(! isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            numbersFound++;
            if(numbersFound >= 5) {
                break;
            }

        }
        System.out.println("total numbers found " + numbersFound);

        /*while (count!=5){
            System.out.println("Count value is " + count);
            count++;
        }*/

        do {
            System.out.println("Count value is " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while (count != 6);
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
