import java.util.*;

public class InverseofNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        scn.close();

        int inverse = 0;
        int position = 1;
        boolean[] seen = new boolean[10]; // To check for duplicate digits

        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            // Ensure valid input where digits represent positions (1 to number length) &
            // are unique
            if (digit == 0 || digit > 9 || seen[digit]) {
                System.out.println("Invalid input for inversion!");
                return;
            }

            seen[digit] = true;
            inverse += position * (int) Math.pow(10, digit - 1);
            position++;
        }

        System.out.println("Inverse: " + inverse);
    }
}
