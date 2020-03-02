package JavaPlaylist2;

public class PrimitiveTypesChallange {
    public static void main (String [] args){
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long l = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(l);
        short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));
    }
}
