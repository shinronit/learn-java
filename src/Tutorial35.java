public class Tutorial35 {
    public static void main (String[]args){
        System.out.println(average(25)+"");



        average(2, 3, 4);
        int [] myArray = {2, 3, 4};
        averageWithInputArray(myArray);

        averageWithInputArray(new int [] {2, 4, 6});

        average(1,2,3,4,5,6,7);
    }

    public static int average(int...numbers){
        int total=0;
        for (int x:numbers)
            total+=x;

        return total/numbers.length;
    }

    public static int averageWithInputArray(int [] numbers) {
        int total=0;
        for (int x:numbers)
            total+=x;

        return total/numbers.length;
    }
}
