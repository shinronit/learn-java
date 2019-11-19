public class Addition {

    public static int add(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[ ] args) {
        System.out.println("2 + 2 is: " + add(2, 2));

        Addition adder = new Addition();
        System.out.println("2 + 2 is: " + adder.addition(2, 2));

    }
}
