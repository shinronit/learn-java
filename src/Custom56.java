public class Custom56 {
    public static void main (String []args){
        String [] words = {"funk","chunk","furry","mango","hen","hello","hey","hence"};
        for ( String a : words ) {
            if (a.endsWith("unk")) {
                System.out.println(a + " ends with unk");
            }
            if (a.startsWith("fu")) {
                System.out.println(a + " starts with fu");
            }
            if (a.startsWith("he")){
                System.out.println(a + " starts with he");
            }
        }
    }
}
