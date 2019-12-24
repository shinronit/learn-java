public class Tutorial41 {
    public static void main (String [] args){


        T41 T41Object = new T41();
        T41 T41Object2 = new T41(5);
        T41 T41Object3 = new T41(5,13);
        T41 T41Object4 = new T41(5,13,43);

        System.out.printf("%s\n", T41Object.toMilitary());
        System.out.printf("%s\n", T41Object2.toMilitary());
        System.out.printf("%s\n", T41Object3.toMilitary());
        System.out.printf("%s\n", T41Object4.toMilitary());


    }
}
