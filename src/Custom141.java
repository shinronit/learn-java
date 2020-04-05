import java.util.Scanner;

public class Custom141 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] inputCharacters = input.toCharArray();
        boolean isDuplicate = false;
        System.out.println("Is Duplicate Characters present?:");
        int [] count = new int[26];
        for(int i = 0; i < inputCharacters.length; i++) {
            char curerntChar = inputCharacters[i];
            count[curerntChar - 'a']++;
            if (count[curerntChar - 'a'] > 1) {
                isDuplicate = true;
                break;
            }
        }

        System.out.println(isDuplicate ? "Yes" : "No");
    }
}
