import java.util.EnumSet;

public class Tutorial45 {
    public static void main (String[]args){
        for(T45 people: T45.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        System.out.println("\now for the range of constanss!!!\n");

        for(T45 people: EnumSet.range(T45.Ronit,T45.PaganMin))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}
