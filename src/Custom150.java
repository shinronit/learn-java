public class Custom150 {
    public static void main (String[]args){
        int x = 1;
        while (x<10){
            System.out.println("Number by while loop : " + x);
            x++;
        }

        for (int i = 1;i<10;){
            System.out.println("Number by for loop : " + i);
            i++;
        }

        String array[] = {"Ronit", "Aban", "Shincochan"};
        for (String j:array)
        {
            System.out.println("Names : " + j);
        }
        String Tip [] = {"25", "50", "100"};
        for (String T:Tip){
            System.out.println("What tip do you want to give : " + T);
        }
    }
}