public class T47 {
    private String first;
    private String last;

    // static changes all the objects
    private static int members = 0;

    public T47(String fn,String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club:%d\n", first, last ,members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
