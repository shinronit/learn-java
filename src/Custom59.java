public class Custom59 {
    public static void main(String [ ] args){
        int number = 1;
        while (true) {
            if (number > 9999) {
                number++;
                System.out.println("Hey yur reached the max value");
                System.exit(0);
            }else{
                System.out.println(number++);
            }
        }
    }
}
