public class parsingValuesFromAString {
    public static void main(String[] args) {
        String numberAsString = "2019.1212";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("Number = " + number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
