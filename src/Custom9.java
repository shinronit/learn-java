import java.util.Scanner;

public class Custom9 {
    public static void main ( String[] args ) {
        System.out.println ( "Type down your name like this {Shin} " );
        Scanner result = new Scanner ( System.in );
        System.out.println ( result.nextLine ( ) + " result is down here " );
        int marks = 400;
        int maths = 80;
        int science = 70;
        int english = 98;
        int hindi = 37;
        int total = maths + science + english + hindi;
        int pass = 200;
        double percentage = pass % total;

        System.out.println ( );
        if ( maths > 40 || science > 40 || english > 40 || hindi > 40 ) {
            System.out.println ( "You failed in some subjects" );
        }
        System.out.println ( "Marks in maths = " + maths );
        System.out.println ( "Marks in science = " + science );
        System.out.println ( "Marks in hindi = " + hindi );
        System.out.println ( "Marks in english = " + english );
        System.out.println ( );

        System.out.println ( "Total marks = " + marks );
        System.out.println ( "Marks per subject = 100 " );
        System.out.println ( "Pass marks = 200 " );
        System.out.println ( "Pass Marks per subject = 40 " );
        System.out.print ( "Total marks earned = " );
        System.out.println ( maths + science + english + hindi );
        System.out.print ( "Marks Lost = " );
        System.out.println ( marks - total );
        System.out.println ( "Percentage = " + percentage );

        if ( pass < total ) {
            System.out.println ( "Passed \uD83E\uDD11 \uD83E\uDD11  " );
        } else if ( pass > total ) {
            System.out.println ( "You failed this time \uD83D\uDE21 \uD83D\uDE21 \uD83E\uDD2E " );
        } else if ( pass == total ) {
            System.out.println ( "You got saved some how this time \uD83D\uDE21 \uD83D\uDE21 " );
        }
    }
}
