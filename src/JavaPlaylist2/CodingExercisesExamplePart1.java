package JavaPlaylist2;

public class CodingExercisesExamplePart1 {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0) {
            return - 1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
}
