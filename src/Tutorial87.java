public class Tutorial87 {
    public static void main (String [] args){

        String a = "apples";
        String b = "cuckoo";
        String c =  "CUCKOO";
        System.out.println(a.length());

        if(a.equals("apples")){
            System.out.println("it equals apples!");
        }
        if(b.equalsIgnoreCase(c)){
            System.out.println("cuckoo match");
        }
    }
}
