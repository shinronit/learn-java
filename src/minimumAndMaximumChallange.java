import java.util.Scanner;

    public class minimumAndMaximumChallange {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int min = 0;
            int max = 0;
            int numberCount = 0;
            boolean first = true;

            while (numberCount!=4){
                numberCount++;
                System.out.println("Enter number : ");
                boolean hasInt = scanner.hasNextInt();
                if(hasInt){
                    int number = scanner.nextInt();

                    if(first){
                        first = false;
                        min = number;
                        max = number;
                    }
                    if(number>max){
                        max = number;
                    }

                    if(number<=min){
                        min = number;
                    }

                }else {
                    System.out.println("Invalid Number.");
                    break;
                }
                scanner.nextLine();
            }
            System.out.println("Min : " +  min);
            System.out.println("Max : " + max);
            scanner.close();
        }
    }
