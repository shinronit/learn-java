//Declaration statement is used to define a variable by indicating the date type,and the name,and optionally to set
//the variable to a certain value.
//sout = system.out.println("");
//Eight primitive data types in java are boolean,byte,char,short,int,long,float,double.
//java packages is a way to organize your java projects
package JavaPlaylist2;

public class PrimitiveTypes {
    public static void main (String [] args){

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinValue);
        System.out.println("Integer maximum value = " + myMaxValue);
        System.out.println("Busted max value = " + (myMaxValue + 1));//Overflow
        System.out.println("Busted min value = " + (myMinValue - 1));//Underflow

        int myMaxintTest = 2147483647;
    }
}