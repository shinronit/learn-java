//Declaration statement is used to define a variable by indicating the date type,and the name,and optionally to set
//the variable to a certain value.
//sout = system.out.println("");
//Eight primitive data types in java are boolean,byte,char,short,int,long,float,double.
//java packages is a way to organize your java projects
package JavaPlaylist2;

public class ByteShortLongWidth {
    public static void main (String [] args){

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinValue);
        System.out.println("Integer maximum value = " + myMaxValue);
        System.out.println("Busted max value = " + (myMaxValue + 1));//Overflow
        System.out.println("Busted min value = " + (myMinValue - 1));//Underflow

        int myMaxintTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647977L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

    }
}