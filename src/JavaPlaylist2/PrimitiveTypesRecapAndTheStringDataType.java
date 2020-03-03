package JavaPlaylist2;

public class PrimitiveTypesRecapAndTheStringDataType {
    public static void main (String [] args){
        String myString = "This is a string ";
        System.out.println("myString is squal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is squal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is squal to " + myString);
        String numberString = "250.55 ";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string is equal to " + lastString);
    }
}
