import java.util.EnumSet;

public class Tutorial45Practice {
    public static void main (String[]args){
        for(T45Practice people: T45Practice.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}
