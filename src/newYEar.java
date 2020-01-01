public class newYEar {
    public static void main (String []args){
        int year = 2015;
        for(int i = 0; i < 6; i++){
            System.out.println(year);
            year++;
            if (year==2020){
                System.out.println(year);
                System.out.println("Happy New year");
                System.exit(0);
            }else{
                System.out.println("Good Bye " + year);
            }
        }
    }
}
