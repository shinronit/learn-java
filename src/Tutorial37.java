public class Tutorial37 {
    public static void main (String []args){
        T37Class t37Object = new T37Class();
        System.out.println(t37Object.toMilitary());
        System.out.println(t37Object.toString());

        t37Object.setTime(13, 27, 6);
        System.out.println(t37Object.toMilitary());
        System.out.println(t37Object.toString());
    }
}
