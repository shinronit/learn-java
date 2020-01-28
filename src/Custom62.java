public class Custom62 {
    public static void main (String[] args){
        String [] animals = {"dog","cat","monkey","cow","lion","bull","snake"};
        for (String a : animals){
            if(a.startsWith("c")){
                System.out.println(a + " starts with c");
            }
        }
    }
}
