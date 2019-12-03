public class Tutorial35 {
    public static void main (String[]args){
        System.out.println(average(43,56,73));
    }

    public static int average(int...numbers){
        int total=0;
        for (int x:numbers)
            total+=x;

        return total/numbers.length;
    }
}
