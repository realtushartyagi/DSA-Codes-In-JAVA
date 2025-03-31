import java.util.*;

public class StringCompression {

    // Compression Type 1: Remove consecutive duplicates
    public static String compression1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i)); // Append only the first occurrence of a character
            }
        }
        return sb.toString();
    }

    // Compression Type 2: Remove consecutive duplicates and count occurrences
    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                if (counter > 1) {
                    sb.append(counter); // Append frequency count (if > 1)
                }
                sb.append(str.charAt(i)); // Append first occurrence
                counter = 1; // Reset counter for new character group
            } else {
                counter++;
            }
        }

        if (counter > 1) {
            sb.append(counter); // Append frequency for last group
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking user input with prompt
        System.out.print("Enter a string: ");
        String str = scn.nextLine().trim();

        // Handling empty input
        if (str.isEmpty()) {
            System.out.println("Invalid input! Please enter a non-empty string.");
        } else {
            System.out.println("Compressed (Type 1): " + compression1(str));
            System.out.println("Compressed (Type 2): " + compression2(str));
        }

        scn.close(); // Close scanner to prevent resource leak
    }
}
