//Method is a collection of statements (one or more) that perform an operation.
//Main method is an entry point for any java code
//Static is a java keyword that needs an understanding of other concepts
//void is another java keyword used to indicate that the method will not return anything
//Statement is a complete command to be executed and cana include one or more expressions
//Variables are a way to store information in our computer.They can be accessed by name
//Declaration statement is used to define a variable by indicating the date type,and the name,and optionally to set
//the variable to a certain value.
//sout = system.out.println("");
package JavaPlaylist2;

public class StartingOutWithExpression {
    public static void main (String [] args){
        System.out.println("Hello  World");

        int myFirstNumber = (15 + 5) + ( 2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myTotal);
        System.out.println(myLastOne);
    }
}
