public class Tutorial38 {
    public static void main (String []args){
        T38Class t38Object = new T38Class();
        System.out.println(t38Object.toMilitary());
        System.out.println(t38Object.toString());

       t38Object.setTime(13, 27, 6);
        System.out.println(t38Object.toMilitary());
        System.out.println(t38Object.toString());
    }
}
